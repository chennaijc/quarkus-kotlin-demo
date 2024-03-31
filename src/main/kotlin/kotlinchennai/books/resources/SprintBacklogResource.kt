package kotlinchennai.books.resources

import jakarta.inject.Inject
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import kotlinchennai.books.service.SprintBacklogService
import org.jboss.logging.Logger

@Path("/api/sprintbacklog")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class SprintBacklogResource (@Inject var log: Logger, private val sprintBacklogService: SprintBacklogService) {

    @GET
    fun getAllBooks() = sprintBacklogService.getAllSprintBacklogItems()
}

