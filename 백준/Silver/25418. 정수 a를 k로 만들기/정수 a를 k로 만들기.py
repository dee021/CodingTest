from collections import deque

a, k = map(int, input().split())
num = [0 for _ in range(k+1)]
queue = deque([(a, 0)])

while True:
    if num[k]:
        print(num[k])
        break
    n, ans = queue.popleft()
    ans += 1
    for i in [n*2, n+1]:
        if i > k:
            continue
        if num[i] and num[i] <= ans:
            continue
        num[i] = ans
        queue.append((i, ans))