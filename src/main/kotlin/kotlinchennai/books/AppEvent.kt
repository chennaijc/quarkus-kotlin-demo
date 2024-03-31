package kotlinchennai.books

import io.quarkus.runtime.Shutdown
import io.quarkus.runtime.Startup
import kotlinchennai.books.dto.BookDTO
import kotlinchennai.books.dto.SprintBItemDTO
import kotlinchennai.books.dto.SubTasksDTO
import kotlinchennai.books.repository.SprintBacklogRepository
import kotlinchennai.books.service.BookService
import kotlinchennai.books.service.SprintBacklogService

class AppEvent(private val bookService: BookService,private val sprintBacklogService: SprintBacklogService) {

    @Startup
    fun onStartup() {
        bookService.createBook(BookDTO(title="Sapiens: A Brief History of Humankind", publishedOn = 2011))
        bookService.createBook(BookDTO(title="The Emperor of All Maladies", publishedOn = 2010))

     //   val sprintBItemDTO = SprintBItemDTO()
var subTasksDTO1 = arrayListOf(SubTasksDTO(subTaskId = "GVTPOD11-111",summary="Analysis of the Story",
    priority="Medium",assigned="", status="To Do"),SubTasksDTO(subTaskId = "GVTPOD11-112",summary="Create Class and pages",
        priority="Medium",assigned="", status="To Do"),SubTasksDTO(subTaskId = "GVTPOD11-113",summary="Coding business logic",
    priority="Medium",assigned="", status="To Do"),SubTasksDTO(subTaskId = "GVTPOD11-114",summary="Code review 1 and 2 Level",
    priority="Medium",assigned="", status="To Do"))

        val sprintBItemDTO = SprintBItemDTO(itemId = "GVTPOD11-11", summary = "Auth matching for Transaction",
            priority = "High", assigned = "Varun Kumar", status = "To Do",
            storyPoints = "2", subTasks = subTasksDTO1 )

        sprintBacklogService.createSprintBacklogItem(sprintBItemDTO)

    }



    @Shutdown
    fun onShutdown() {

        println("SMReporter Shutting down")
    }
}