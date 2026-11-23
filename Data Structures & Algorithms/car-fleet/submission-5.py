

class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        zipped = list(zip(position, speed))
        s = sorted(zipped, key=lambda x :x[0], reverse=True)
        stack = []
        for pos, speed in s:
            time = (target - pos) / speed
            if not stack or time > stack[-1]: stack.append(time)
        return len(stack)
