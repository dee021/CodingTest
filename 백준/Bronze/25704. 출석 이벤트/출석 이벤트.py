dc = [500, 0.9, 2000, 0.75]
n = int(input())
p = int(input())
ans = p

for i in range(0, min(n//5, 4)):
    if i%2:
        ans = min(ans, p*dc[i])
        
    else:
        ans = min(ans, p-dc[i])
print(max(int(ans), 0))