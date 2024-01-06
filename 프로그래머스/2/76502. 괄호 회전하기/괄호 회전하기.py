from collections import deque

def solution(s):
    s = deque(s)
    d = {')':'(', ']':'[', '}':'{'}
    answer = 0
    for _ in range(len(s)):
        stack = []
        
        for i in s:
            if stack and i in d and stack[-1] == d[i]:
                stack.pop()
            else:
                stack.append(i)
        
        if not stack:
            answer += 1
        s.rotate(-1)
    return answer


