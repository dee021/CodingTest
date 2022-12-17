s, m = map(int, input().split())
if s < m:
    print(-1)
    exit()

a, b = (s+m)//2, (s-m)//2
print(a, b) if a+b == s and a-b == m else print(-1)