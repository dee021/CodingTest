a = int(input())
bc = int(input())
bl = int(input())
pc = int(input())
u = int(input())

if u > bl:
    print(min(a*u, bc+(u-bl)*pc))
else:
    print(min(a*u, bc))