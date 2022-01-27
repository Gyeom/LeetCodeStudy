class Solution {
fun maxArea(height: IntArray): Int {
    // Maximum area will be stored in this variable
    var maximumArea = Int.MIN_VALUE
    // Left and right pointers
    var left = 0
    var right = height.size - 1
    // Loop until left and right meet
    while (left < right) {
        // Shorter pole/vertical line
        val shorterLine = height[left].coerceAtMost(height[right])
        // Update maximum area if required
        maximumArea = maximumArea.coerceAtLeast(shorterLine * (right - left))
        // If there is a longer vertical line present
        if (height[left] < height[right]) {
            left++
        } else {
            right--
        }
    }
    return maximumArea
}
}