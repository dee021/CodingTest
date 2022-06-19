k = int(input())

res = 1
for i in range(k, 0, -1):
    res = res * i

res = list(str(res))
res.reverse()

zero = 0
for i in res:
    if i == '0':
        zero = zero +1
    else:
        break

print(zero)