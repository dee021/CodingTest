import sys
input = sys.stdin.readline

t = 0
while True:
    t += 1
    s = list(input().strip())
    stack = []
    if s.count('-'):
        break
    for i in range(len(s)):
        if s[i] == '}' and stack and stack[-1] == '{':
            stack.pop()
        else:
            stack.append(s[i])
    cnt = 0
    for i in range(len(stack)):
        if i%2 and stack[i] == '{':
            cnt += 1
        elif not i%2 and stack[i] == '}':
            cnt += 1
    print('{}. {}'.format(t, cnt))