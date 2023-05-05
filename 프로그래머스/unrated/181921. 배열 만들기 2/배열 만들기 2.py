from itertools import product

def solution(l, r):
    answer = set()
    for i in range(len(str(l)), len(str(r))+1):
        for nums in list(product('05', repeat=i)):
            if l <= int(''.join(nums)) <= r:
                answer.add(int(''.join(nums)))
    answer = sorted(answer)
    return answer and answer or [-1]