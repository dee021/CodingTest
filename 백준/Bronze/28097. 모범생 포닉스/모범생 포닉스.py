n = int(input())
time = list(map(int, input().split()))
ans = (n-1)*8 + sum(time)
print(ans//24, ans%24)