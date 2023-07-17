from collections import Counter

for _ in range(int(input())):
    a, b = map(Counter, input().split())
    print(a == b and 'Possible' or 'Impossible')