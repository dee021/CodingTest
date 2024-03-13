from collections import deque
import sys

def sol(lst):
    post = []
    stack = []
    while lst or post:
        temp = deque([])
        if not lst:
            lst = post.pop()
        stack.append(lst.popleft())
        while lst and lst[0] < stack[-1]:
            temp.append(lst.popleft())
        if temp:
            post.append(temp)
    print(*stack[::-1], sep = '\n')

sol(deque([int(x) for x in sys.stdin]))