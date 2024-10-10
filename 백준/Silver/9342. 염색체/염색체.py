import sys
import re
input = sys.stdin.readline
ptn = '([ABCDEF])?A+F+C+([ABCDEF])?'
p = re.compile(ptn)

def check(s):
    if bool(p.match(s)) and len(p.match(s).group()) == len(s):
        return 'Infected!'
    return 'Good'

for _ in range(int(input())):
    print(check(input().strip()))