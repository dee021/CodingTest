num = idx = ans= 0
a, b = map(int, input().split())
for i in range(1, b+1):
    num += 1
    for j in range(i):
        idx += 1
        if idx >= a and idx <= b:
            ans += num
print(ans)