package kotlinchennai.books.entity

import io.quarkus.hibernate.orm.panache.PanacheEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name="SubTasks")
class SubTasksEntity: PanacheEntity() {
    lateinit var   subTaskId: String
    lateinit var   summary: String
    lateinit var   priority: String
    lateinit var   assigned: String
    lateinit var   status: String
}