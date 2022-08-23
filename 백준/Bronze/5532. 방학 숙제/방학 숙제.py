l=int(input())
a=int(input())
b=int(input())
c=int(input())
a = a // c + 1 if a%c else a // c
d=int(input())
b = b // d + 1 if b%d else b // d
print(l-max(a, b))