@file:JsExport

package bee

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class DocumentStatus(val label: String) {
    Draft("Draft"),
    WaitingForReview("Waiting for review"),
    InReview("In review"),
    Readjust("Re-adjust"),
    Approved("Approved"),
    Rejected("Rejected"),
    Cancelled("Cancelled")
}