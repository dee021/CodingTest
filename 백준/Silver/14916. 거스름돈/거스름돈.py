n = int(input())
ans = 0

for i in range(n//5, -1, -1):
    if not (n-(i*5))%2:
        ans = i + (n-(i*5))//2
        break
print(ans if ans else -1)