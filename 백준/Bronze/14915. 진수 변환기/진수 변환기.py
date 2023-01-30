nums = {n:str(n) if n < 10 else chr(55+n) for n in range(0,16)}
n, b = map(int, input().split())
ans = ''
for i in range(19, -1, -1):
    if n//(b**i) or ans:
        ans += nums[n//(b**i)]
        n %= (b**i)
if not ans:
    ans = '0'
print(ans)