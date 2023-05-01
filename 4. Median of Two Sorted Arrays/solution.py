class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """

        size1 = len(nums1)
        size2 = len(nums2)
        combSize = size1 + size2
        if combSize % 2 == 1:
            median = (combSize + 1) / 2
            i = -1
            j = -1
            k = 0
            while True:
                k += 1
                if k == median:
                    if size1 == i + 1:
                        return nums2[j+1]
                    elif size2 == j + 1:
                        return nums1[i+1]
                    elif nums1[i+1] <= nums2[j+1]:
                        return nums1[i+1]
                    else:
                        return nums2[j+1]
                else:
                    if size1 == i + 1:
                        j += 1
                    elif size2 == j + 1:
                        i += 1
                    elif nums1[i+1] <= nums2[j+1]:
                        i += 1
                    else:
                        j += 1
        else:
            median = (combSize) / 2
            median2 = median + 1
            i = -1
            j = -1
            k = 0
            while True:
                k += 1
                if k == median:
                    if size1 == i + 1:
                        median = nums2[j+1]
                        j += 1
                    elif size2 == j + 1:
                        median = nums1[i+1]
                        i += 1
                    elif nums1[i+1] <= nums2[j+1]:
                        median = nums1[i+1]
                        i += 1
                    else:
                        median = nums2[j+1]
                        j +=1
                    
                    if size1 == i + 1:
                        median2 = nums2[j+1]
                    elif size2 == j + 1:
                        median2 = nums1[i+1]
                    elif nums1[i+1] <= nums2[j+1]:
                        median2 = nums1[i+1]
                    else:
                        median2 = nums2[j+1]
                    break
                else:
                    if size1 == i + 1:
                        j += 1
                    elif size2 == j + 1:
                        i += 1
                    elif nums1[i+1] <= nums2[j+1]:
                        i += 1
                    else:
                        j += 1
            return float((median + median2)) / 2
