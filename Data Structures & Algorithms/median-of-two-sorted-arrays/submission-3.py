class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:        
        def getMiddleValuesArray(nums):
            if not nums:
                return []
            if len(nums) == 1:
                return [nums[0]]
            if len(nums) % 2 == 0:
                return [nums[(len(nums)//2)-1],nums[len(nums)//2]]
            else:
                return [nums[len(nums)//2]]
        def getMedian(nums):
            if len(nums) % 2 == 0:
                return float((nums[(len(nums)//2-1)]+nums[len(nums)//2]) / 2)
            else:
                return float(nums[len(nums)//2])
        Array_Of_Middle_Vals = getMiddleValuesArray(nums1) + getMiddleValuesArray(nums2)
        Array_Of_Middle_Vals.sort()
        return getMedian(Array_Of_Middle_Vals)
        