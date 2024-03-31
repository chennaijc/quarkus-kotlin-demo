package kotlinchennai.books.entity

import io.quarkus.hibernate.orm.panache.PanacheEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name="Book")
class BookEntity : PanacheEntity()  {
    lateinit var title: String
    var publishedOn : Int = 0
}