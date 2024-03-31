package kotlinchennai.books.service

import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional
import kotlinchennai.books.dto.SprintBItemDTO
import kotlinchennai.books.dto.SubTasksDTO
import kotlinchennai.books.entity.SprintBItemEntity
import kotlinchennai.books.entity.SubTasksEntity
import kotlinchennai.books.repository.SprintBacklogRepository

@ApplicationScoped
class SprintBacklogService(private val sprintBacklogRepository: SprintBacklogRepository) {


    fun getAllSprintBacklogItems() = sprintBacklogRepository.listAll().map { it.toDto() }

    fun getSprintBacklogItem(id: Long) = sprintBacklogRepository.findById(id)?.toDto()

    @Transactional
    fun createSprintBacklogItem(sprintBItemDTO: SprintBItemDTO) = sprintBacklogRepository.persist(sprintBItemDTO.toEntity())

    private fun SprintBItemEntity.toDto() = subTasks?.let { it ->
        SprintBItemDTO(
            id = id, itemId = itemId, summary = summary,
            priority = priority, assigned = assigned, status = status,
            storyPoints = storyPoints, subTasks = it.map { it.toDto() }
        )
    }

    private fun SubTasksEntity.toDto() = SubTasksDTO(
        subTaskId = subTaskId,summary = summary,priority = priority,
        assigned = assigned, status = status
    )

     private fun SprintBItemDTO.toEntity() = SprintBItemEntity().also {
          it.itemId = this.itemId; it.summary = this.summary;it.priority = this.priority
          it.assigned=this.assigned;it.status=this.status;it.storyPoints=this.storyPoints
          it.subTasks = it.subTasks
      }
}