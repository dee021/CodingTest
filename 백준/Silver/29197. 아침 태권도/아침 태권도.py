import sys
input = sys.stdin.readline

n = int(input())
arr = [[] for _ in range(5)]
cnt = 0
for _ in range(n):
    x, y = map(int, input().split())
    if 0 in [x, y]:
        idx = 0
    elif x > 0 and y > 0:
        idx = 1
    elif x < 0 and y > 0:
        idx = 2
    elif x < 0 and y < 0:
        idx = 3
    else:
        idx = 4
    flag = 0
    for a, b in arr[idx]:
        if x == 0:
            if a == 0 and b*y > 0:
                flag = 1
        elif y == 0:
            if b == 0 and a * x > 0:
                flag = 1
        else:
            if y/x == b/a:
                flag = 1
        if flag:
            break
    if not flag:
        arr[idx].append(tuple([x, y]))
        cnt += 1

print(cnt)