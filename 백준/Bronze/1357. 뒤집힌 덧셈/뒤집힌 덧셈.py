def sol(x, y):
    return sum(map(int, (x[::-1], y[::-1])))

ans = str(sol(*input().split()))
print(int(ans[::-1]))