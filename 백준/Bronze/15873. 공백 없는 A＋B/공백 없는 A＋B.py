ans = 0
ab = input().replace('10', 't')
for i in ab:
    if i == 't':
        ans += 10
    else:
        ans += int(i)
print(ans)