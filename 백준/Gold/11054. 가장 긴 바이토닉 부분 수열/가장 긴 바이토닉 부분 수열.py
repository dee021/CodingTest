import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
asc = [0 for _ in range(n)]
stack = [0]
for i in range(n):
    if arr[i] > stack[-1]:
        stack.append(arr[i])
    elif arr[i] < stack[-1]:
        for j in range(len(stack)-1):
            if stack[j] < arr[i] <= stack[j+1]:
                stack[j+1] = arr[i]
                break
    asc[i] = len(stack) -1

stack = [0]
ans = asc[-1]
for i in range(n-1, -1, -1):
    if arr[i] > stack[-1]:
        stack.append(arr[i])
    elif arr[i] < stack[-1]:
        for j in range(len(stack)-1):
            if stack[j] < arr[i] <= stack[j+1]:
                stack[j+1] = arr[i]
                break
    ans = max(ans, asc[i] + len(stack) -2)
print(ans)