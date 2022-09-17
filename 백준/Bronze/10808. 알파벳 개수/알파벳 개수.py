s = [0 for _ in range(26)]
for i in input():
    s[ord(i)-97] += 1
print(*s)