def sol(m):
    m = int(m)
    if m%2:
        return m-m//2
    return m//2

n, k = map(int, input().split())
arr = sum(map(sol, input().split()))

print(n <= arr and 'YES' or 'NO')