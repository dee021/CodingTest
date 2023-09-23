b = bin(int(input()))[2:][::-1]
ans = 0

for i in range(len(b)):
    ans += int(b[i])*3**i
print(ans)