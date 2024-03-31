package kotlinchennai.books.web

import io.quarkus.qute.Location
import io.quarkus.qute.Template
import io.quarkus.qute.TemplateInstance
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType


@Path("/") // ①
@Produces(MediaType.TEXT_HTML)
class IndexEndpoint @Inject constructor(@Location("index/index.html") val index: Template) {

    @GET
    fun index(): TemplateInstance = index.data("title", "My first template", "text", "Hello 👋🏻 Welcome")
}