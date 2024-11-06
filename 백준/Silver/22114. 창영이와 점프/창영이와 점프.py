import sys
input = sys.stdin.readline

n, k = map(int, input().split())
stack = [1]
for l in list(map(int, input().split())):
    if l <= k:
        stack[-1] += 1
    else:
        stack.append(1)

ans = stack[0]
for i in range(1, len(stack)):
    ans = max(ans, stack[i], stack[i] + stack[i-1])
print(ans)