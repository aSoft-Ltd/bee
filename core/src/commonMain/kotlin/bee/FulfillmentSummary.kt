@file:JsExport

package bee

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class FulfillmentSummary(
//    val entries: List<LineItemRef>,
    val status: TaskStatus
)