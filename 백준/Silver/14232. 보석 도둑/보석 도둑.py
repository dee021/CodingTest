def sol(k, start = 3):
    if k % 2 == 0:
        ans.append(2)
        sol(k//2)
    else:
        for p in range(start, int(k**0.5) + 1, 2):
            if k % p == 0:
                ans.append(p)
                sol(k//p, p)
                return
        ans.append(k)

ans = []
sol(int(input()))
print(len(ans))
print(*sorted(ans))