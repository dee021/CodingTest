import sys
input = sys.stdin.readline

def sol(k):
    for a in range(k):
        if not prime[a]:
            continue
        for b in range(k):
            if not prime[b]:
                continue
            for c in range(k):
                if not prime[c]:
                    continue
                if a + b + c == k:
                    return [a, b, c]
    return [0]

prime = [1 if x%2 else 0 for x in range(1000)]
prime[1] = 0; prime[2] = 1

for p in range(3, 1000, 2):
    if p*p >= 1000:
        break
    if not prime[p]:
        continue
    k = 3
    while p*k < 1000:
        prime[p*k] = 0
        k += 2

for _ in range(int(input())):
    n = int(input())
    print(*sol(n))