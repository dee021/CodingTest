n, l = map(int, input().split())
for h in sorted(list(map(int, input().split()))):
    if h <= l:
        l += 1
    else:
        break
print(l)