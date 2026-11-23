import string

class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        fixed = "".join(i.lower() for i in s if not i in string.punctuation and i != " ")
        left, right = 0, len(fixed) - 1

        while right>=left:
            if (fixed[left] != fixed[right]):
                return False
            left += 1
            right -=1

        return True
