n = int(input())
win = [0 for _ in range(max(5, n+1))]
win[1] = win[3] = win[4] = 1
for k in range(5, n+1):
    for m in [1,3,4]:
        if win[k-m] == 0:
            win[k] = 1
            break
print(win[n] and 'SK' or 'CY')