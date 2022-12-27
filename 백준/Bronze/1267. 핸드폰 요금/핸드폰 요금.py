y = 0; m = 0
n = int(input())
arr = list(map(int, input().split()))

for i in range(n):
    y += (arr[i]//30 + 1)*10
    m += (arr[i]//60 + 1)*15

if y == m:
    print('Y M', y)
elif y < m:
    print('Y', y)
else:
    print('M', m)