n, p = map(int, input().split())
f = 1
for i in range(1, n+1):
    f = (f*(i%p))%p
print(f)