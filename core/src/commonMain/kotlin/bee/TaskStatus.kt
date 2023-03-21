@file:JsExport

package bee

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class TaskStatus {
    Pending,
    InProgress,
    Completed,
    Cancelled
}