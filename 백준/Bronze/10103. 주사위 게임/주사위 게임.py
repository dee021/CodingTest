import sys
input = sys.stdin.readline

chang, sang = 100, 100
for _ in range(int(input())):
    c, s = map(int, input().split())
    if c > s :
        sang -= c
    elif c < s:
        chang -= s
print(chang, sang, sep='\n')