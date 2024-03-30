package kotlinchennai.movie.web

import io.quarkus.qute.Location
import io.quarkus.qute.Template
import io.quarkus.qute.TemplateInstance
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType


@Path("/sprintboard") // ①
@Produces(MediaType.TEXT_HTML)
class SprintboardEndpoint @Inject constructor( val sprintboard: Template) {

    @GET
    fun sprintboard(): TemplateInstance = sprintboard.data("title", "My first template", "text", "Hello 👋🏻 Welcome")
}