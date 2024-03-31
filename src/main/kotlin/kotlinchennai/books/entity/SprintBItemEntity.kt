package kotlinchennai.books.entity

import io.quarkus.hibernate.orm.panache.PanacheEntity
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name="SprintBacklog")
class SprintBItemEntity: PanacheEntity() {
    lateinit var  itemId: String
    lateinit var  summary: String
    lateinit var  priority: String
    lateinit var  assigned: String
    lateinit var  status: String
    lateinit var  storyPoints: String
    @OneToMany
    var  subTasks: ArrayList<SubTasksEntity>? = null
}