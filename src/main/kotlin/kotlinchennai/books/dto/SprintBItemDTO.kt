package kotlinchennai.books.dto

class SprintBItemDTO(
    val itemId: String,
    val summary: String,
    val priority: String,
    val assigned: String,
    val status: String,
    val storyPoints: String,
    val id: Long=0,
    val subTasks: List<SubTasksDTO>
)