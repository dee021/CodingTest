import sys
input = sys.stdin.readline

ans = []
s = []
for _ in range(int(input())):
    o = list(map(int, input().split()))
    if len(o) > 1:
        s.append(o[1])
    else:
        ans.append(str([s[-1] if s else -1, len(s), 0 if s else 1, s[-1] if s else -1][o[0]-2]))
        if o[0] == 2 and s:
            s.pop()
sys.stdout.write('\n'.join(ans))