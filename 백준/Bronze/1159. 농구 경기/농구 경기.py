arr = [input()[0] for _ in range(int(input()))]
f = 1
for i in range(97, 123):
    if arr.count(chr(i)) >= 5:
        f = 0
        print(chr(i), end='')

if f: print('PREDAJA')