arr = [list(map(int, input().split())) for _ in range(3)]
d = (arr[1][0] - arr[0][0]) * (arr[2][1] - arr[1][1]) - (arr[2][0] - arr[1][0]) * (arr[1][1] - arr[0][1])
if d > 0:
    ans = 1
elif d < 0:
    ans = -1
else:
    ans = 0
print(ans)