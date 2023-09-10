n = int(input())
arr = [0 for _ in range(10000)]
for _ in range(n):
    x, y = map(int, input().split())
    arr[x:y] = [1]*(y-x)

print(sum(arr))