def sol(a, b):
    while a and b:
        a, b = max(a, b), min(a, b)
        a, b = b, a % b
    return a or b

a, b = map(int, input().split())
print('1'*sol(a, b))