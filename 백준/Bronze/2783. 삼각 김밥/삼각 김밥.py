x, y= map(int, input().split())
ans = x/y
for _ in range(int(input())):
    x, y = map(int, input().split())
    ans = min(ans, x/y)
print('%0.2f' %(ans*1000))