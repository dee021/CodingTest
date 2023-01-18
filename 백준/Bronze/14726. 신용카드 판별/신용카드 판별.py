def sol(n):
    n *= 2
    if n > 9:
        n = str(n)
        n = int(n[0]) + int(n[1])
    return n

for _ in range(int(input())):
    n = list(map(int, input()))
    for i in range(0, 16, 2):
        n[i] = sol(n[i])
    n = sum(n)
    print('F' if n%10 else 'T')