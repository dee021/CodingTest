import sys
n = int(input())

for i in range(n):
    stack = []
    anomaly=0

    ps = sys.stdin.readline().strip()
    for i in ps:
        if i == '(':
            stack.append(i)
        elif len(stack) != 0:
            stack.pop()
        else:
            anomaly=1
            break
    if anomaly or len(stack):
        print('NO')
    else:
        print('YES')