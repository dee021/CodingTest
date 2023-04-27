n = int(input())
fibo = [0 for _ in range(n+1)]
fibo[0] = 1
if n:
    fibo[1] = 1

for i in range(n-1):
    fibo[i+2] = (1 + fibo[i] + fibo[i+1])%1000000007

print(fibo[n])