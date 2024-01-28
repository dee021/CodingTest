from functools import reduce
from math import gcd

def solution(arrayA, arrayB):
    d = {0:arrayA, 1:arrayB}
    
    def sol(lst, f):
        for k in lst[::-1]:
            flag = 1
            for x in d[f]:
                if not x%k:
                    flag = 0
                    break
            if flag:
                return k
        return 0
    
    if set(arrayA) & set(arrayB):
        return 0
    g = reduce(lambda x, y:gcd(x, y), arrayA)
    a = [x for x in range(2, g+1) if not g%x]
    g = reduce(lambda x, y:gcd(x, y), arrayB)
    b = [x for x in range(2, g+1) if not g%x]
    
    answer = sol(a, 1)
    answer = max(answer, sol(b, 0))
    
    return answer

'''
철수/영희의 최대공약수의 약수가 후보
'''