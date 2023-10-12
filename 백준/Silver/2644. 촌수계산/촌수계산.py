def update(p, c):
    node[c] = p

def root(nd):
    path = [nd]
    if node[nd] == nd:
        return path
    path.extend(root(node[nd]))
    return path

n = int(input())
node = [x for x in range(n+1)]
q = list(map(int, input().split()))
for _ in range(int(input())):
    update(*map(int, input().split()))

q = list(map(root, q))
if q[0][-1] != q[1][-1]:
    print(-1)
else:
    for i, d in enumerate([list(x) for x in zip(*[q[0][::-1], q[1][::-1]])]):
        if d[0] != d[1]:
            print(len(q[0])+len(q[1])-2*(i))
            break
    else:
        print(abs(len(q[0])-len(q[1])))