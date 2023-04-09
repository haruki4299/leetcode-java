class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """

        lenS = len(s)
        longest = 0
        i = 0       
        while i < lenS:
            j = i
            chars = []
            curLongest = 0
            while j < lenS:
                char = s[j]
                if char in chars:
                    if curLongest > longest:
                        longest = curLongest
                    break
                else:
                    curLongest += 1
                    chars.append(char)
                j += 1
            i += 1
            if curLongest > longest:
                longest = curLongest
        return longest
            
