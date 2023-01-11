ans = 0
for b in input().split():
    ans += int(b, 2)

print(bin(ans)[2:])