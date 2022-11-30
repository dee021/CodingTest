from collections import Counter

def solution(A, B):
    if Counter(A) != Counter(B):
        return -1
    answer = 0
    while answer < len(A) and A != B:
        A = A[-1] + A[:-1]
        answer += 1
    return answer if A == B else -1