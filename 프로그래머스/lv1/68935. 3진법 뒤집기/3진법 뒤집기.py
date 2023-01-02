def solution(n):
    temp = ''
    ans = 0
    for i in range(16, -1, -1):
        temp += str(n//3**i) if n//3**i or temp else ''
        n %= 3**i
    for i in range(len(temp)):
        ans += int(temp[i]) * 3**i
    return ans