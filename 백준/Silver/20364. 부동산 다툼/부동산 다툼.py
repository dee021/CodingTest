import sys
input = sys.stdin.readline
print = sys.stdout.write

def path(node):
    cur = node
    stack = []
    while cur >= 1:
        if cur in tree:
            stack.append(cur)
        if cur % 2:
            cur = (cur - 1)//2
        else:
            cur //= 2
    if not stack:
        tree[node] = 0
        return '0'
    return str(stack.pop())

n, q = map(int, input().split())
tree = {}
for _ in range(q):
    print(path(int(input())) + '\n')