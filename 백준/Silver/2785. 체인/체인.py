from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
lengths = deque(sorted(map(int, input().split())))
ans = 0

while len(lengths) > 1:
    chain = lengths.popleft()
    while chain and lengths:
        ans += 1
        chain -= 1
        one = lengths.pop() +1
        if lengths:
            lengths.append(lengths.pop() + one)
        else:
            lengths.append(one + chain)
            chain = 0
print(ans)