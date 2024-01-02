def sol(idx):
    n = ''
    stack = []
    while idx < len(q):
        if q[idx].isnumeric():
            n += q[idx]
        else:
            if n:
                stack.append(stack.pop()*int(n))
                n = ''
            
            if q[idx] == '(':
                idx, res = sol(idx + 1)
                stack.append(res)
                continue
            elif q[idx] == ')':
                return idx + 1, sum(stack)
            else:
                stack.append(d[q[idx]])
        idx += 1
        
    if n:
        stack.append(stack.pop()*int(n))
    return idx +1, sum(stack)


q = input().strip()
d = {'H': 1, 'C': 12, 'O':16}
idx, ans = sol(0)
print(ans)