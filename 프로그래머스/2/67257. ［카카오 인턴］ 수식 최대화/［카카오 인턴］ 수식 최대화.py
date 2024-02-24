def cal(op, order):
    for od in order:
        while od in op and len(op) > 1:
            for i, o in enumerate(op):
                if o == od:
                    exp = ''
                    for _ in range(3):
                        exp += op.pop(i-1)
                    op.insert(i-1, str(eval(exp)))
                    break
                    
    return int(op[0])


def solution(expression):
    ans = 0
    op = []
    tmp = ''
    for e in expression:
        if e.isnumeric():
            tmp += e
        else:
            op.append(tmp)
            tmp = ''
            op.append(e)
    op.append(tmp)
    
    
    order = ['*-+', '*+-', '+-*', '-+*', '-*+', '+*-']
    for od in order:
        ans = max(ans, abs(cal(op.copy(), od)))
    return ans