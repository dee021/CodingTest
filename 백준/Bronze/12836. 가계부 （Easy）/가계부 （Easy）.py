import sys
input = sys.stdin.readline

n, q = map(int, input().split())
log = [0 for _ in range(n+1)]

for _ in range(q):
    func, arg1, arg2 = map(int, input().split())
    if func == 1:
        log[arg1] += arg2
    else:
        print(sum(log[arg1:arg2+1]))