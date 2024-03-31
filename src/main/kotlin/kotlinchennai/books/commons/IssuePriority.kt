package kotlinchennai.books.commons

enum class IssuePriority(val text: String,val color: String) {
    CRITICAL("Critical","red"),
    HIGH("High",""),
    MEDIUM("Medium",""),
    LOW("Low","")
}