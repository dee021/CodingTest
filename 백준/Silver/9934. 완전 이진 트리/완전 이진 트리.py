def preorder(idx, level):
    tree[level-1].append(nodes[idx])
    visited[idx] = 1
    m = 2**(k-level)//2
    if 0 <= idx - m < CNT and not visited[idx - m]:
        preorder(idx - m, level + 1)
    if 0 <= idx + m < CNT and not visited[idx + m]:
        preorder(idx + m, level + 1)
    return

k = int(input())
CNT = 2**k-1
visited = [0 for _ in range(CNT)]
nodes = list(map(int, input().split()))
tree = [[] for _ in range(k)]

preorder((2**k-1)//2, 1)
for i in range(k):
    print(*tree[i])