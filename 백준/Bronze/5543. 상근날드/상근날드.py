ans = temp = 2000
for _ in range(3):
    ans = min(ans, int(input()))
for _ in range(2):
    temp = min(temp, int(input()))
print(ans + temp - 50)