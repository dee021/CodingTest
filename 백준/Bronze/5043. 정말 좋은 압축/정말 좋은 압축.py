n, b = map(int, input().split())
p = 1

for i in range(1, b+1):
    p += 2**i

print(n <= p and 'yes' or 'no')