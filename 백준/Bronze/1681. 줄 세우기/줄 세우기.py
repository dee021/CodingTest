n, l = input().split(); n = int(n)
a = 0
for i in range(n):
    a += 1
    while str(a).count(l):
        a += 1
print(a)