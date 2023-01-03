def solution(n, arr1, arr2):
    answer = []
    for r in range(n):
        ans = ''
        for c in range(n-1, -1, -1):
            if arr1[r]//2**c or arr2[r]//2**c:
                ans += '#'
            else:
                ans += ' '
            arr1[r] %= 2**c
            arr2[r] %= 2**c
        answer.append(ans)
    return answer