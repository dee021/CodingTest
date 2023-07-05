n = int(input())
f = {'1/4':0, '1/2':0, '3/4':0}
for _ in range(n):
    f[input()] += 1
ans = f['3/4'] + f['1/2']//2 + bool(f['1/2']%2)
f['1/4'] -= f['1/4'] if f['3/4'] >= f['1/4'] else f['3/4']
if f['1/4']:
    f['1/4'] -= min(2,f['1/4'])  if f['1/2']%2 else 0
print(ans + f['1/4']//4 + bool(f['1/4']%4))