ans = ''
for a, b in [list(x) for x in zip(*[list(map(int, input().split())) for _ in range(2)])]:
    if a == b:
        ans += 'D'
    elif a > b:
        ans += 'A'
    else:
        ans += 'B'
cnt = ans.count
s = [cnt('A')*3+cnt('D'), cnt('B')*3+cnt('D')]
print(*s)
if cnt('D') != 10:
    print(['A', 'B'][s[0] < s[1]] if s[0]!= s[1] else ans[::-1].replace('D', '')[0])
else:
    print('D')