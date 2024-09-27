import sys
input = sys.stdin.readline

def dirty(index):
    global cnt
    if index in way:
        return
    way.add(index)
    if index-1 in way and index+1 in way:
        cnt -= 1
    elif index-1 not in way and index+1 not in way:
        cnt += 1

n, m = map(int, input().split())
way = set()
cnt = 0

for i, v in enumerate(list(map(int, input().split()))):
    if v:
        dirty(i+1)

for _ in range(m):
    o = list(map(int, input().split()))
    if len(o) == 1:
        print(cnt)
    else:
        dirty(o[1])