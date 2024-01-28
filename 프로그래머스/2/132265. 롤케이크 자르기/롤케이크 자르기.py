from collections import Counter

def solution(topping):
    right = Counter(topping)
    left = set()
    answer = 0
    r, l = len(right.keys()), 0
    
    for t in topping:
        right[t] -= 1
        if right[t] == 0:
            r -= 1
        if t not in left:
            l += 1
            left.add(t)
        if l == r:
            answer += 1
    
    return answer