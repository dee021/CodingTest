from collections import deque
import sys
input = sys.stdin.readline

char = [0 for _ in range(26)]
n, k = map(int, input().split())
arr = deque(['?' for _ in range(n)])
for _ in range(k):
    a, b = input().strip().split()
    arr.rotate(int(a))
    if arr[0] == '?' and not char[ord(b) - ord('A')]:
        arr[0] = b
        char[ord(b) - ord('A')] = 1
    elif arr[0] == b:
        continue
    else:
        print('!')
        break
else:
    print(''.join(arr))