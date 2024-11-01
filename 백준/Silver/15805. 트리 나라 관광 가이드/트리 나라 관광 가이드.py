import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
node = [-1 for _ in range(max(arr)+1)]

for i in range(1, n):
    if node[arr[i]] == -1 and arr[i] != arr[0]:
        node[arr[i]] = arr[i-1]
print(len(node))
print(*node)