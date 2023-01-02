def solution(n):
    ans = ''.join(sorted(str(n), reverse=True))
    return int(ans)