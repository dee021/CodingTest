ans = 0
for _ in range(int(input())):
    t, d = input().split()
    t = sum(map(lambda x, y: x*y, map(int, t.split(':')), [60,1]))
    l = len([x for x in range(t, t+int(d)) if 7*60 <= x < 19*60])
    ans += l*10 + (int(d)-l)*5
print(ans)