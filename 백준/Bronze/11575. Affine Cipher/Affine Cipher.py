for _ in range(int(input())):
    a, b = map(int, input().split())
    bf = ''.join([chr(i+ord('A')) for i in range(26)])
    at = ''.join([bf[(a*x + b) % 26] for x in range(26)])
    table = str.maketrans(bf, at)
    print(input().translate(table))