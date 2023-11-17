ans = 0
stack = []
s = input()
for c in s:
    if c == '(':
        f = 1
        stack.append(c)
    else:
        stack.pop()
        if f:
            ans += len(stack)
        else:
            ans += 1
        f = 0
print(ans)