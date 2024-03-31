package kotlinchennai.books.service

import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional
import kotlinchennai.books.dto.BookDTO
import kotlinchennai.books.entity.BookEntity
import kotlinchennai.books.repository.BookRepository

@ApplicationScoped
class BookService( private val bookRepository: BookRepository) {

    fun getAllBooks() = bookRepository.listAll().map { it.toDto() }

    fun getBook(id: Long) = bookRepository.findById(id)?.toDto()

    @Transactional
    fun createBook(bookDTO: BookDTO) = bookRepository.persist(bookDTO.toEntity())

    private fun BookEntity.toDto() = BookDTO(title = title, publishedOn = publishedOn, id = id)

    fun BookDTO.toEntity() = BookEntity().also {
        it.title = this.title; it.publishedOn = this.publishedOn;
    }
}