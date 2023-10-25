a, b = input().split()
if len(a) < len(b):
    print(0)
    exit(0)
ans = 0
for l in range(len(a)):
    if a[l] != b[l]:
        break
    if a[l] == '8':
        ans += 1
print(ans)
