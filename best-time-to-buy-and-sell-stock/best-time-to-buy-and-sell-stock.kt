import kotlin.math.max
import kotlin.math.min

class Solution {
fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var minValue = prices[0]
    for (index in 1 until prices.count()) {
        val buyValue = prices[index]
        maxProfit = max(buyValue - minValue, maxProfit)
        minValue = min(minValue, buyValue)
    }
    return maxProfit
}
}