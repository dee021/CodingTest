n = int(input())
ans = 0

for _ in range(n):
    s = int(input())
    if not s//100:
        if s//10 == 6:
            s += 30
        if s%10 in [0,6]:
            s += [9, 3][bool(s%10)]
    ans += s
ans /= n
if not ans%0.5 and not int(ans)%2:
    ans += 0.1
print(round(ans))