s = 0
for _ in range(10):
    m = int(input())
    if abs(100-s) >= abs(100-s-m):
        s += m
    else:
        break
print(s)