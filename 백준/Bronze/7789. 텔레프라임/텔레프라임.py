n, m = map(int, input().split())
m = m*10**6 + n
prime = [x for x in range(2, n+1)]
prime.append(m)

for i in range(len(prime)):
    if i >= len(prime) or prime[i] > m**0.5:
        break
    prime = [x for x in prime if x <= prime[i] or x%prime[i] != 0]

print('Yes' if prime[-2] == n and prime[-1] == m else 'No')
