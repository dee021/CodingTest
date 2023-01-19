fibo = [0, 1]
n = int(input())
for i in range(abs(n)-1):
    fibo.append((fibo[i] + fibo[i+1])%1000000000)
if n > 0:
    print(1)
elif n < 0:
    print(1 if abs(n)%2 else -1)
else:
    print(0)
print(fibo[abs(n)])