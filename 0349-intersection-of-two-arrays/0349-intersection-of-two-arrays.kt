class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = nums1.toHashSet()
    val resultSet = hashSetOf<Int>()

    for (num in nums2) {
        if (set1.contains(num)) {
            resultSet.add(num)
        }
    }

    return resultSet.toIntArray()
    }
}