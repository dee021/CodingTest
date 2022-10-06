ans = num = 1
s = int(input())
while num + ans < s:
    ans += 1
    num += ans
print(ans)

# sol)
# 서로 다른 n개로 나타낼 수 있는 최소의 수 
# = 1 + 2 + ... + (n-1) + n