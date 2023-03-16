def solution(n):
    l, k = 1, n
    answer = 0
    while l**2 < 2*n:
        res = k*(k+1)/2 - (k-l)*(k-l+1)/2
        if res > n:
            l += 1
            k = max(int(n/l) - l + 1, 1)
            continue
        if int(res) == n == res:
            answer += 1
        k += 1
    return answer