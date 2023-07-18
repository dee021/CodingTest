def sol(f, lst):
    if f:
        lst = list(reversed(lst))
    ans = 1
    m = lst[0]
    for h in lst[1:]:
        if m < h:
            ans += 1
            m = h
    return ans

n = int(input())
arr = [int(input()) for _ in range(n)]
print(sol(False, arr), sol(True, arr), sep='\n')