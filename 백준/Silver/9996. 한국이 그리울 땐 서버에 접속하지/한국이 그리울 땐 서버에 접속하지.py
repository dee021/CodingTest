import sys
input = sys.stdin.readline
import re

n = int(input())
ptn = re.compile(input().strip().replace('*', '[a-z]*'))

for _ in range(n):
    s = input().strip()
    try:
        if ptn.match(s).group() == s:
            print('DA')
        else:
            print('NE')
    except:
        print('NE')