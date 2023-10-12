n = int(input())
arr = sorted(map(int, input().split()))
m = int(input())
s = sum(arr)
u, i = arr[-1], n
while 0 <= i:
    if m >= s + u*(n-i):
        break
    i -= 1
    s -= arr[i]
    u = arr[i-1]
if i < 0:
    i, u, s = 0, 0, 0
try:
    for c in range(arr[i], u-1, -1):
        if m >= s + c*(n-i):
            print(c)
            break
except:
    print(max(arr))