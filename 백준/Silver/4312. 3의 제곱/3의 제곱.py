import sys
input = sys.stdin.readline

def exp(e):
    if e not in d:
        if e%2:
            d[e] = exp(e//2)**2*3
        else:
            d[e] = exp(e//2)**2
    return d[e]

d = {0:1, 1:3}
while True:
    n = int(input())
    if not n:
        break
    ans = []
    b = bin(n-1)[2:][::-1]
    for i in range(len(b)):
        if b[i] == '1':
            ans.append(str(exp(i)))
    if ans:
        print('{ ' + ', '.join(ans) + ' }')
    else:
        print('{ }')