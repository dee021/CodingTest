import sys
n, m = map(int, sys.stdin.readline().split())

x = 2
factor=[]
while x <= min(n,m): # 공약수
    if (n%x) == 0 and (m%x)==0:
        n = n//x
        m = m//x
        factor.append(x)
    else:
        x = x + 1
x = 1
for i in factor:
    x = x * i

print(x, x*n*m, sep='\n')