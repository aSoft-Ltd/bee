@file:JsExport

package bee

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class FulfillmentSummary(
//    val entries: List<LineItemRef>,
    val status: TaskStatus
)