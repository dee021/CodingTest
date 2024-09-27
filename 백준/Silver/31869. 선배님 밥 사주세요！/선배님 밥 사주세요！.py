import sys
input = sys.stdin.readline

inputs = lambda x: x if x[0].isalpha() else int(x)

cal = [[0 for _ in range(7)] for _ in range(11)]
stu = {}
n = int(input())
for _ in range(n):
    name, w, d, p = map(inputs, input().strip().split())
    stu[name] = [w, d, p]

for _ in range(n):
    name, p = map(inputs, input().strip().split())
    if stu[name][2] > p:
        stu.pop(name)
    else:
        cal[stu[name][0]][stu[name][1]] = 1

flag, ans, cnt = 0,0,0
for w in range(1, 11):
    for d in range(7):
        if cal[w][d]:
            if flag:
                cnt += 1
            else:
                flag = 1
                cnt = 1
            ans = max(ans, cnt)
        elif flag:
            flag = 0
            cnt = 0
print(ans)