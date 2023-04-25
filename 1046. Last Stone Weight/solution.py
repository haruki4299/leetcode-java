class Solution(object):
    def lastStoneWeight(self, stones):
        """
        :type stones: List[int]
        :rtype: int
        """

        stones.sort(reverse=True)
        numOfStones = len(stones)
        while numOfStones > 1:
            if stones[0] == stones[1]:
                stones.pop(0)
                stones.pop(0)
                numOfStones -= 2
            elif stones[0] > stones[1]:
                newStone = stones[0] - stones[1]
                stones[1] = newStone
                stones.pop(0)
                numOfStones -= 1
                stones.sort(reverse=True)

        if len(stones) == 0:
            return 0
        else:
            return stones[0]
