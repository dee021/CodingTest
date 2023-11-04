def sol(n, sr, sc):
    if n == 1:
        return arr[sr][sc]

    res1 = sol(n//2, sr, sc)
    res2 = sol(n//2, sr, sc+n//2)
    res3 = sol(n//2, sr+n//2, sc)
    res4 = sol(n//2, sr+n//2, sc+n//2)
    res = res1+res2+res3+res4
    res = res.replace('1111', '1').replace('0000', '0')
    if res in ['0', '1']:
        return res
    return '(' + res + ')'

n = int(input())
arr = [list(input()) for _ in range(n)]
print(sol(n, 0, 0))