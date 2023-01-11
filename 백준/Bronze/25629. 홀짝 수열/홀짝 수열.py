o, e = 0, 0
n = int(input())

for num in list(map(int, input().split())):
    if num%2:
        o += 1
    else:
        e += 1

print(o in [e, e+1] and 1 or 0)