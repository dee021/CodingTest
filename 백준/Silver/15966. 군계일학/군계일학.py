import sys
input = sys.stdin.readline

n = int(input())
stack = []
ans = 1
for a in map(int, input().split()):
    flag = False
    for i in range(len(stack)):
        if stack[i][0] + stack[i][1] == a:
            flag = True
            stack[i][1] += 1
            ans = max(ans, stack[i][1])
    if not flag:
        stack.append([a, 1])

print(ans)