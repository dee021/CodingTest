conv = lambda x: int(x[:2])*60 + int(x[2:]) - 10*60
o, c = conv('1000'), conv('2200')
time = [1 for _ in range(12*60)]

for _ in range(int(input())):
    s, e = map(conv, input().strip().split())
    for idx in range(max(s-10, 0), min(e+10, c)):
        time[idx] = 0

ans, temp = 0,0
for t in time:
    if t:
        temp += 1
    else:
        ans = max(ans, temp)
        temp = 0
print(max(ans, temp))