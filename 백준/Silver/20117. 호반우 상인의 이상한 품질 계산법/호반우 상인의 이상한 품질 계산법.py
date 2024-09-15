from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
arr = deque(sorted(map(int, input().split())))

ans = 0
while len(arr) > 1:
    a, b = arr.pop(), arr.popleft()
    ans += a*2
print(ans + (arr[0]if arr else 0))