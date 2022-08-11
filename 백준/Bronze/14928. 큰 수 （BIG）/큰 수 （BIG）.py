ans = 0
for i in input():
    ans = (ans*10 + int(i))%20000303
print(ans)