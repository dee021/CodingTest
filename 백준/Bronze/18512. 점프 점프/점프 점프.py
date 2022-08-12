a, b, s1, s2 = map(int, input().split())

for _ in range(1000):
    if s1 == s2:
        break
    if s1 < s2:
        s1 += a
    else:
        s2 += b
print(s1 if s1 == s2 else -1)