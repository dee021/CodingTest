fib = [0 for _ in range(42)]
fib[41] = fib[1] = fib[2] = 1

for i in range(3, 41):
    fib[i] = fib[i-1] + fib[i-2]

t = int(input())
for i in range(t):
    n = int(input())
    print(fib[n-1], fib[n])