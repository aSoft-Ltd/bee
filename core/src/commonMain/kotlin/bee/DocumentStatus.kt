@file:JsExport

package bee

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class DocumentStatus(val label: String) {
    Draft("Draft"),
    WaitingForReview("Waiting for review"),
    InReview("In review"),
    Readjust("Re-adjust"),
    Approved("Approved"),
    Cancelled("Cancelled")
}