@file:JsExport
package bee

import kotlin.js.JsExport
import kotlinx.serialization.Serializable
@Serializable
data class DeliverSummary(
    val entries: List<Delivery>,
    val status: DeliveryStatus
)