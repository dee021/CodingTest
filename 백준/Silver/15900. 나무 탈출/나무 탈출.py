import sys
input = sys.stdin.readline

def sol():
    global ans
    
    stack = [[1, 0]]
    visited[1] = 1
    
    while stack:
        node, depth = stack.pop()
        visited[node] = 1
        flag = 1
    
        for post in tree[node]:
            if not visited[post]:
                flag = 0
                stack.append([post, (depth+1)%2])

        if flag:
            ans = (ans + depth) % 2

ans = 0
n = int(input())
visited = [0 for _ in range(n+1)]
tree = {}
for _ in range(n-1):
    a, b = map(int, input().split())
    tree.setdefault(a, []).append(b)
    tree.setdefault(b, []).append(a)

sol()
print(ans and 'Yes' or 'No')