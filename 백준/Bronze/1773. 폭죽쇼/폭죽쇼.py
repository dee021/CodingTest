n, c = map(int, input().split())
ans = set()
t = list(set([int(input()) for _ in range(n)]))

for k in t:
    for i in range(1, c//k+1):
        ans.add(k*i)
print(len(ans))