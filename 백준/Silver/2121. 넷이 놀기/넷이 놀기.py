import sys
input = sys.stdin.readline

n = int(input())
w, h = map(int, input().split())
dlen = [[w, 0], [0, h], [w, h]]
spots = set([tuple(map(int, input().split())) for _ in range(n)])

ans = 0
for x, y in list(spots):
    flag = 1
    for a, b in dlen:
        if tuple([x+a, y+b]) not in spots:
            flag = 0
            break
    ans += flag

print(ans)