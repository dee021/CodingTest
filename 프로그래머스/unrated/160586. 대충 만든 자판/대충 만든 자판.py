def solution(keymap, targets):
    d = {}
    for keys in keymap:
        for k in set(keys):
            if k in d and d[k] > keys.index(k) +1:
                d[k] = keys.index(k) +1
            elif k not in d:
                d[k] = keys.index(k) +1

    answer = []
    for tg in targets:
        a, f = 0, 0
        for c in tg:
            if c not in d:
                f = 1
            else:
                a += d[c]
        answer.append(f and -1 or a)
    return answer