import sys
input = sys.stdin.readline

def sol(n, k):
    global minV, maxV
    if k:
        maxV += '5'+('0'*(n-1))
        if n >= 2:
            tmp = '1'+('0'*(n-2))+'5'
        else:
            tmp = '5'
        minV += tmp
    else:
        maxV += '1'*n
        minV += '1'+'0'*(n-1)

kim = input().strip()
l, maxV, minV = 0, '', ''
for i, x in enumerate(kim):
    l += 1
    if x == 'K':
        sol(l, 1)
        l = 0
if l:
    sol(l, 0)

print(maxV, minV, sep='\n')