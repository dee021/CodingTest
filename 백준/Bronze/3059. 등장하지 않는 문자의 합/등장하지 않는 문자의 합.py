al = set([chr(n) for n in range(65, 91)])
for _ in range(int(input())):
    print(sum(map(ord, al-set(input()))))