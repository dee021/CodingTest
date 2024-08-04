import sys
input = sys.stdin.readline

fibo = [0 for _ in range(100001)]
fibo[1] = 1
d = {}

for i in range(2, 100001):
    fibo[i] = fibo[i-1] + fibo[i-2]
    d[fibo[i]] = i

for _ in range(int(input())):
    fn = int(input())
    print(d[fn])