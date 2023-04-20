def solution(order):
    l, c = len(order), 0
    for m in order:
        if 'cafe' in m:
            c += 1
            l -= 1
    return 4500*l + 5000*c