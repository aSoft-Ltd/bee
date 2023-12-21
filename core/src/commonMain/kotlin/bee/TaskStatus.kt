@file:JsExport

package bee

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class TaskStatus(val label: String) {
    Pending("Pending"),
    InProgress("In Progress"),
    Completed("Completed"),
    Cancelled("Cancelled")
}