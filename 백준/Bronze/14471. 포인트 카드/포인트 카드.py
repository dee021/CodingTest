import sys

arr = []; ans = 0
n, m = map(int, input().split())
m -= 1
for i in range(m+1):
    a = int(input().split()[0])
    if a >= n:
        m -= 1
    else:
        arr.append(a)
    if not m:
        sys.stdin.readlines()
        print(0)
        exit(0)
while m:
    ans += n - max(arr)
    arr.remove(max(arr))
    m -= 1
print(ans)