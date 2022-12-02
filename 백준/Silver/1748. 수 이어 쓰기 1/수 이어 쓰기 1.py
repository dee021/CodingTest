num = [10**x for x in range(0,9)]
res = 0

n = int(input())

for i in num[::-1]:
    if n//i:
        res += len(str(i)) * (min(i*10, n+1)-i)
print(res)