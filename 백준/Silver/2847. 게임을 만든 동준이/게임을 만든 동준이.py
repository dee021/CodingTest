n = int(input())
s = [int(input()) for _ in range(n)]
s.reverse()
ans = 0
for i in range(n-1):
    if s[i] <= s[i+1]:
        ans += s[i+1] - s[i] +1
        s[i+1] = s[i]-1
print(ans)