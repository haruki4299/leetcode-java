# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        ans = ListNode()
        ansbld = ans
        carry = 0
        ansbld.val = l1.val + l2.val + carry
        if ansbld.val > 9:
            ansbld.val -= 10
            carry = 1
        l1 = l1.next
        l2 = l2.next

        while l1 != None or l2 != None:
            ansbld.next = ListNode()
            ansbld = ansbld.next
            if l1 == None:
                ansbld.val = l2.val + carry
                if ansbld.val > 9:
                    ansbld.val -= 10
                    carry = 1
                else:
                    carry = 0
                l2 = l2.next
            elif l2 == None:
                ansbld.val = l1.val + carry
                if ansbld.val > 9:
                    ansbld.val -= 10
                    carry = 1
                else:
                    carry = 0
                l1 = l1.next
            else:
                ansbld.val = l1.val + l2.val + carry
                if ansbld.val > 9:
                    ansbld.val -= 10
                    carry = 1
                else:
                    carry = 0
                l1 = l1.next
                l2 = l2.next

        # carry
        if carry == 1:
            ansbld.next = ListNode()
            ansbld = ansbld.next
            ansbld.val = 1

        return ans
