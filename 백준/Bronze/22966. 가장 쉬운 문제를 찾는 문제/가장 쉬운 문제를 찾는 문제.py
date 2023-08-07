a = [5,'']
for _ in range(int(input())):
    t, g = input().split()
    if a[0] > int(g):
        a = [int(g), t]
print(a[1])