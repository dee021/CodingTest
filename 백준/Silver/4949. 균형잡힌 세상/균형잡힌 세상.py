import sys


while 1:
    stack = []
    anomaly=0
    ps = sys.stdin.readline().split('\n')[0]
    if ps == '.':
        break
    for i in ps:
        if i in ['(','[']:
            stack.append(i)
        if i == ')':
            if len(stack) == 0:
                anomaly=1
                break
            elif stack[len(stack)-1] == '(':
                stack.pop()
            else:
                anomaly=1
                break
        elif i == ']':
            if len(stack) == 0:
                anomaly=1
                break
            elif stack[len(stack)-1] == '[':
                stack.pop()
            else:
                anomaly=1
                break
    if anomaly or len(stack):
        print('no')
    else:
        print('yes')