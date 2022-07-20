code = list(map(int, input().split()))

def sol(num):
    return num**2
code = sum(list(map(sol, code)))
print(code%10)