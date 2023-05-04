int(input())
file = list(map(int, input().split()))
c = int(input())
ans = 0
for f in file:
    ans += f//c + int(f%c > 0)
print(c*ans)