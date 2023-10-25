def preorder(visited=0):
    stack = [0]
    ans = ''
    while visited != ALL_VISITED:
        node = stack.pop()
        if node == '.' or (visited & 1 << node):
            continue
        ans += chr(node + A)
        visited += 1 << node
        stack.extend(tree[node][::-1])
    return ans

def inorder(node):
    if tree[node][0] == '.':
        left = []
    else:
        left = inorder(tree[node][0])
    if tree[node][1] == '.':
        right = []
    else:
        right = inorder(tree[node][1])
    res = []
    res.extend(left)
    res.extend([node])
    res.extend(right)
    return res

def postorder(node):
    if tree[node][0] == '.':
        left = []
    else:
        left = postorder(tree[node][0])
    if tree[node][1] == '.':
        right = []
    else:
        right = postorder(tree[node][1])
    res = []
    res.extend(left)
    res.extend(right)
    res.extend([node])
    return res

conv = lambda x: ord(x) - A if x != '.' else x
size = int(input())
A = ord('A')
ALL_VISITED = (1 << size) -1
tree = {}
for _ in range(size):
    n, l, r = map(conv, input().split())
    tree[n] = [l, r]
print(preorder())
print(''.join(list(map(lambda x:chr(x+A),inorder(0)))))
print(''.join(list(map(lambda x:chr(x+A),postorder(0)))))