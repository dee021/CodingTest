import sys
input = sys.stdin.readline

n, k = map(int, input().split())
arr = list(map(int, input().split()))
done = sorted(arr)

while arr != done and k:
    for i in range(n-1):
        if arr[i] > arr[i+1]:
            k -= 1
            arr[i], arr[i+1] = arr[i+1], arr[i]
        if not k:
            print(arr[i], arr[i+1])
            break
if k:
    print(-1)