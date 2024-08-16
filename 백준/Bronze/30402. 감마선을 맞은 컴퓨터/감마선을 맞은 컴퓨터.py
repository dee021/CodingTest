import sys
input = sys.stdin.readline

ans = ''
for _ in range(15):
    for p in input().strip().split():
        if p == 'w':
            ans = 'chunbae'
        elif p == 'b':
            ans = 'nabi'
        elif p == 'g':
            ans = 'yeongcheol'
        if ans:
            break
    if ans:
        break
print(ans)