n, i = map(int, input().split())
arr = []
for _ in range(n):
    arr.append(input())
print(sorted(arr)[i-1])