n = int(input())
ans = ''
for x in range(4, -1, -1):
    if n >= 9**x:
        ans += str(n//9**x)
        n %= 9**x
    elif ans:
        ans += '0'
print(ans)