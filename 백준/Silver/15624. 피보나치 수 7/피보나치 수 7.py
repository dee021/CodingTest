n = int(input())
fibo = [0 for _ in range(n+1)]
if n:
    fibo[1] = 1
for i in range(n-1):
    fibo[i+2] = fibo[i+1] + fibo[i]
    if fibo[i+2]>=1000000007:
        fibo[i+2] %= 1000000007
print(fibo[n])