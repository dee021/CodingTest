factor = [x for x in range(2, int(100000**0.5)+1) if x == 2 or x%2]
for i, f in enumerate(factor):
    for bf in factor[i+1:]:
        if bf%f == 0:
            factor.remove(bf)

for _ in range(int(input())):
    n = int(input())
    idx = 0
    while n > 1 and idx < len(factor) and factor[idx] <= n:
        cnt = 0
        while n%factor[idx] == 0:
            cnt += 1
            n //= factor[idx]
        if cnt:
            print(factor[idx], cnt)
        idx += 1
    if n > 1:
        print(n, 1)