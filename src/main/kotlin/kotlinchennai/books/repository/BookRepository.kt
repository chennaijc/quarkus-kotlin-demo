package kotlinchennai.books.repository

import io.quarkus.hibernate.orm.panache.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped
import kotlinchennai.books.entity.BookEntity
@ApplicationScoped
class BookRepository: PanacheRepository<BookEntity>  {
}