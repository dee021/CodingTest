import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    s = sum(map(int, input().split()))
    day = 1
    while n >= s:
        s *= 4
        day += 1
    print(day)