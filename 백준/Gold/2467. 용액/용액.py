a, b = float('inf'), float('inf')
n = int(input())
idx = -1
lst1, lst2 = [], []
for k in map(int, input().split()):
    if k < 0:
        lst1.append(k)
        idx += 1
    else:
        lst2.append(k)
        for i in range(idx, -1, -1):
            if abs(a+b) > abs(k + lst1[i]):
                a, b = lst1[i], k
            if i > 0 and abs(k + lst1[i]) < abs(k + lst1[i-1]):
                idx = i
                break


if len(lst1) >= 2 and abs(a+b) > abs(sum(lst1[:-3:-1])):
    a, b = lst1[-2], lst1[-1]
if len(lst2) >= 2 and abs(a+b) > abs(sum(lst2[:2])):
    a, b = lst2[:2]
print(a, b)