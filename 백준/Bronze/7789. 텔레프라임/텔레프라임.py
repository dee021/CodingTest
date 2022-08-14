flag = 1
n, m = map(int, input().split())
m = m*10**6 + n

for i in range(2, int((n+1)**0.5)+1):
    if n%i == 0:
        flag = 0
        break
if flag:
    for i in range(2, int((m+1)**0.5)+1):
        if m%i == 0:
            flag = 0
            break
    print('Yes' if flag else 'No')
else:
    print('No')