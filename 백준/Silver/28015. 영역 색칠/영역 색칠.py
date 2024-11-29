import sys
input = sys.stdin.readline

n, m = map(int, input().split())
ans = 0

for _ in range(n):
    color = [x for x in input().strip().replace(' ', '').split('0') if x]
    if not color:
        continue
    tmp = 0
    for cl in color:
        o, t = cl[0] == '2', cl[0] == '1'
        
        for c in range(1, len(cl)):
            if cl[c-1] != cl[c]:
                if cl[c] == '1':
                    t += 1
                else:
                    o += 1
        tmp += min(t, o) + 1
    ans += tmp
print(ans)