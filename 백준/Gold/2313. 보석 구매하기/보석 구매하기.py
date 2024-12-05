import sys
input = sys.stdin.readline
print = sys.stdout.write

INF = float('inf')
n = int(input())
answer = [0] + ['' for _ in range(n)]
for i in range(1, n+1):
    input()
    start, end, res = -INF, INF, -INF
    c, r = INF, -INF
    for j, w in enumerate(map(int, input().split()), start = 1):
        if w < r + w:
            r += w
            c += 1
        else:
            r = w
            c = 1
        if res < r or (res == r and c < end - start):
            res = r
            end = j
            start = end - c + 1
    answer[0] += res
    answer[i] = '{} {}'.format(start, end)
print(str(answer[0])+'\n')        
print('\n'.join(answer[1:]))