import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    arr = [int(input()) for _ in range(n)]
    stack = [1]
    bomb = 0
    for i in range(1, n):
        if arr[i-1] == arr[i]:
            stack.append(i+1)
            bomb = 0
        elif arr[i-1] < arr[i]:
            if not bomb:
                stack[-1] = i+1
            else:
                bomb = 0
                stack.append(i+1)
        else:
            bomb = 1
    return stack

print(*sol())