package kotlinchennai.books

import io.quarkus.runtime.Shutdown
import io.quarkus.runtime.Startup
import kotlinchennai.books.dto.BookDTO
import kotlinchennai.books.service.BookService

class AppEvent(private val bookService: BookService) {

    @Startup
    fun onStartup() {
        bookService.createBook(BookDTO(title="Sapiens: A Brief History of Humankind", publishedOn = 2011))
        bookService.createBook(BookDTO(title="The Emperor of All Maladies", publishedOn = 2010))
    }
    @Shutdown
    fun onShutdown() {

        println("SMReporter Shutting down")
    }
}