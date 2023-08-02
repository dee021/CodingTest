e = lambda x: ((a*ord(x)-ord('A') + b) % 26) + ord('A')

for _ in range(int(input())):
    a, b = map(int, input().split())
    print(''.join(list(map(chr, list(map(e, input()))))))