package kotlinchennai.books.commons

enum class IssueStatus(val text: String,val color: String) {
    TODO("To Do", "gray"),
    INPROGRESS("In Progress","blue"),
    INREVIEW("In Review", "purple"),
    INTESTING("In Testing","lime"),
    CANCELLED("Cancelled","red"),
    DONE("Done", "green")
}