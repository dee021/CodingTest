def solution(A,B):
    A.sort()
    B.sort(reverse=True)
    answer = [A[i]*B[i] for i in range(len(A))]
    print(answer)
    return sum(answer)