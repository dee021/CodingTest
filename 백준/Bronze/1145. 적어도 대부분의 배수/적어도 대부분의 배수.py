arr = list(map(int, input().split()))

for m in range(min(arr), 100**3):
    res = 0
    for i in range(5):
        if not m%arr[i]:
            res += 1
    if res >= 3:
        print(m)
        break