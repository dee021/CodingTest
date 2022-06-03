import sys
n = int(input())
stack = []
for i in range(n):
    order = sys.stdin.readline().strip()
    if ' ' in order:
        order,val = order.split()
        if order == 'push':
            stack.append(int(val))
    else:
        if order == 'pop':
            print(stack.pop()) if len(stack) != 0 else print(-1)
        elif order == 'size':
            print(len(stack))
        elif order == 'empty':
            print(1) if len(stack) == 0 else print(0)
        elif order == 'top':
            if len(stack) == 0:
                print(-1)
            else:
                print(stack[len(stack)-1])