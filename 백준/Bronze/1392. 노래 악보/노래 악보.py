arr = []
n, q = map(int, input().split())

for i in range(n):
    arr.extend([i+1 for _ in range(int(input()))])
for i in range(q):
    print(arr[int(input())])