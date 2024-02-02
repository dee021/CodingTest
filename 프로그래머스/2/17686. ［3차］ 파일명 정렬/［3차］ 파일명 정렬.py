def solution(files):
    
    def nameSplit(name):
        head, number, tail = '', '', ''
        idx, flag = 0, 0
        while idx < len(name):
            if flag:
                if name[idx].isnumeric():
                    number += name[idx]
                else:
                    tail += name[idx:]
                    break
            elif name[idx].isnumeric():
                flag = 1
                continue
            else:
                head += name[idx]
            idx += 1
        return [head, number, tail]
    
    res = list(map(nameSplit, files))
    res = sorted(res, key = lambda x: (x[0].lower(), int(x[1]), res.index(x)))
    return [''.join(x) for x in res]