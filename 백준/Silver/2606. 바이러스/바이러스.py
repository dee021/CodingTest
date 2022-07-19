from collections import deque

queue = deque([0])
cnt = set([0])

def chkNet(lst, x, q):  
    global c
    q.popleft()
    def addVer(y):
        if lst[x][y] == 1:
            lst[x][y] = lst[y][x] = 0
            cnt.add(y)
            q.append(y)
    list(map(addVer, list(range(c))))
    return

c = int(input())
e = int(input())
net = [[0 for _ in range(c)] for _ in range(c)]

for i in range(e):
    x, y = map(int, input().split())
    x, y = min(x, y) - 1, max(x, y) - 1
    net[x][y] = net[y][x] = 1

while len(queue) != 0:
    chkNet(net, queue[0], queue)
print(len(cnt)-1)