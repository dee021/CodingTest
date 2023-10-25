n, k = map(int, input().split())
ans = 0

while bin(n).count('1') > k:
    for i, b in enumerate(bin(n)[2:][::-1]):
        if b == '1':
            n += 1 << i
            ans += 1 << i
            break
print(ans)