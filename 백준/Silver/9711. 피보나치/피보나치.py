import sys
input = sys.stdin.readline

fibo = [0, 1]
for i in range(9999):
    fibo.append(fibo[i]+fibo[i+1])

for t in range(int(input())):
    p, q = map(int, input().split())
    print('Case #{}: {}'.format(t+1, fibo[p]%q))