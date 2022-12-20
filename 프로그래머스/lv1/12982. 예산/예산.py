def solution(d, budget):
    d = [x for x in sorted(d) if x <= budget]
    while sum(d) > budget:
        d.pop()
    return len(d)