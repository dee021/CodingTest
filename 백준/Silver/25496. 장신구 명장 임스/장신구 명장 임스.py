p, n = map(int, input().split())
arr = sorted(map(int, input().split()))
ans = 0
for i in range(n):
    if p >= 200:
        print(i)
        break
    p += arr[i]
else:
    print(n)