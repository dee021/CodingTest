stack = []
for o in input().strip():
    if o.isnumeric():
        stack.append(o)
    else:
        if o == '/':
            o += o
        a, b = stack.pop(), stack.pop()
        stack.append(str(eval(b + o + a)))
print(stack.pop())