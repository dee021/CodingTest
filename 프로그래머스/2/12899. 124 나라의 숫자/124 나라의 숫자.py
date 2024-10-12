def solution(n):
    answer = ''
    nums = ['1','2','4']
    while n:
        answer += nums[(n-1)%3]
        n = (n-1)//3
            
    return answer[::-1]