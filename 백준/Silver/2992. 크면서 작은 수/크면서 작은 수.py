from itertools import permutations

n = input()
res = sorted(map(''.join, permutations(list(n), len(n))), key=lambda x: int(x))
for k in res:
    if int(k) > int(n):
        print(k)
        break
else:
    print(0)