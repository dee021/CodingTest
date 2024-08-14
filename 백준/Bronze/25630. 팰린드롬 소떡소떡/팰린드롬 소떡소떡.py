n = int(input())
s = input().strip()
ans, l = 0, len(s)
for i in range(l//2):
    if s[i] != s[l-i-1]:
        ans += 1
print(ans)