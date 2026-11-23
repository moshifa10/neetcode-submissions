class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        right = 0
        left =  len(numbers) - 1
        while left >= right :
            total = numbers[right] + numbers[left]
            if total == target: return [right+1, left+1]
            elif total > target:
                left -=1
            else: right +=1