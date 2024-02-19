conv = lambda x: ord(x) - ord('a')

def update(p, c):
    alpha[p] = c

def find(p, q):
    while alpha[p] != -1 and alpha[p] != q:
        p = alpha[p]
    if alpha[p] == q:
        return 'T'
    return 'F'

n = int(input())
alpha = [-1 for _ in range(26)]
for _ in range(n):
    x, y = map(conv, input().strip().split(' is '))
    update(x, y)

for _ in range(int(input())):
    x, y = map(conv, input().strip().split(' is '))
    print(find(x, y))
