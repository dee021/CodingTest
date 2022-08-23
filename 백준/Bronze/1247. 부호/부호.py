from sys import stdin

for _ in range(3):
    ans = 0
    for _ in range(int(input())):
        ans += int(stdin.readline())
    if ans >= 0:
        print('+' if ans else 0)
    else:print('-')
