import sys
input = sys.stdin.readline
print = sys.stdout.write

n = int(input())
node = {x:[] for x in range(1, n+1)}
ans = []
for _ in range(n-1):
    a, b = map(int, input().split())
    node[a].append(b)
    node[b].append(a)

for _ in range(int(input())):
    t, k = map(int, input().split())
    if t == 2 or (t == 1 and len(node[k]) > 1):
        ans.append('yes')
    else:
        ans.append('no')
print('\n'.join(ans))