n = int(input())
ans = 0
for w in range(1, int(n**0.5)+1):
    ans += len(range(w, n//w+1))
print(ans) 