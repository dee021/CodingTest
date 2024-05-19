def sol(q):
    stack = []
    for o in q:
        if o in ['(', '[']:
            stack.append(o)
        else:
            target = ['(', '['][o == ']']
            res, flag = 0, 0
            while stack or flag:
                t = stack.pop()
                if t == target:
                    t = 3 if o == ']' else 2
                    stack.append(t*res if res else t)
                    flag = 1
                    break
                elif type(t) == int:
                    res += t
                else:
                    return 0
            if not flag:
                return 0
    res = 0
    for r in stack:
        if r in ['(', '[', ')', ']']:
            return 0
        res += r
    return res

print(sol(input().strip()))