@file:JsExport
package bee

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class DocumentStatus {
    Draft,
    WaitingForReview,
    InReview,
    Readjust,
    Approved,
}