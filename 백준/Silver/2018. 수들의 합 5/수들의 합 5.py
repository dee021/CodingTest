ans = 0
n = int(input())
t = 1
while True:
    a = (n-sum(range(t)))//t
    if a <= 0 or t > n:
        break
    if a*t + sum(range(t)) == n:
        ans += 1
    t += 1
print(ans)