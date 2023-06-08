ans = 0
for n in range(1,4):
    ans += n*int(input())
print(ans >= 10 and 'happy' or 'sad')