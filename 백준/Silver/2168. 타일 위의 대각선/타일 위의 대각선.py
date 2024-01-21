def gcd(a, b):
    while a and b:
        a, b = max(a, b), min(a, b)
        a, b = a%b, b
    return a or b

x, y = map(int, input().split())
print(x+y-gcd(x, y))