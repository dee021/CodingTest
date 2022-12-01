def solution(lines):
    answer = set()
    lines.sort()
    for i in range(len(lines)-1):
        a, b = lines[i]
        for x, y in lines[i+1:]:
            if x in range(a, b):
                answer |= set([x for x in range(max(a, x), min(y, b))])
    return len(answer)