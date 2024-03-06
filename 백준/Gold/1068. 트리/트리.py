def sol(node):
    global cnt
    flag = 1
    for post in edge[node]:
        if post == d:
            continue
        flag = 0
        if post in edge:
            res = sol(post)
            if res:
                cnt += 1
        else:
            cnt += 1
    return flag

n = int(input())
nodes = list(map(int, input().split()))
d = int(input())
cnt, edge = 0, {}

for i in range(n):
    edge.setdefault(nodes[i], []).append(i)
sol(-1)
print(cnt)