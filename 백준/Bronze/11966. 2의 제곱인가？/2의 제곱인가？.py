n = int(input())

for i in range(31):
    if 2**i == n:
        print(1)
        exit(0)
print(0)