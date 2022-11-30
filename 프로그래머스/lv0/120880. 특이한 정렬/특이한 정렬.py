def solution(numlist, n):
    return sorted([x for x in numlist], key=lambda x: (abs(n-x), -x))