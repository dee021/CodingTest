import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    cur = 0
    for a in map(int, input().split()):
        cur += 1
        if cur == a:
            cur +=1
    print(cur)