import sys
input = sys.stdin.readline

n, k = map(int, input().split())
arr = list(map(int, input().split()))
cnt = 0
for i in range(1, n):
    if arr[i] <= arr[i-1]:
        arr[i] += k
        cnt += 1
        if arr[i] <= arr[i-1]:
            print(-1)
            break
else:
    print(cnt)