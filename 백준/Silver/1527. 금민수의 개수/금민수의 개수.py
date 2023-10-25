def sol(k):
    global ans
    if k and int(k) > b:
        return
    if k and a <= int(k) <= b:
        ans += 1

    for i in range(2):
        sol(k+num[i])


a, b = map(int, input().split())
ans = 0
num = ['4', '7']
sol('')
print(ans)