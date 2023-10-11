ans = 0
for _ in range(int(input())):
    s = []
    for c in input():
        s.append(c)
        if len(s) >= 2 and s[-1] == s[-2]:
            s.pop();s.pop()
    if not s:
        ans += 1
print(ans)