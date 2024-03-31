package kotlinchennai.books.resources

import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import kotlinchennai.books.dto.BookDTO
import kotlinchennai.books.service.BookService
import org.jboss.logging.Logger

@Path("/api/book")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class BookResource  ( @Inject var log: Logger,private val bookService: BookService) {

    @POST
    fun createMovie(bookDTO: BookDTO) = bookService.createBook(bookDTO)

    @GET
    fun getAllBooks() = bookService.getAllBooks()

    @GET
    @Path("/{id}")
    fun getBookById( id: Long) = bookService.getBook(id)
    
}