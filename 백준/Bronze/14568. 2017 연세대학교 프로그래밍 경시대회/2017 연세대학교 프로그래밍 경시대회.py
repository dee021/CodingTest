ans = 0
n = int(input())

for t in range(2, n, 2):
    if n - t < 4:
        break
    ans += (n-t-2)//2
    
print(ans)