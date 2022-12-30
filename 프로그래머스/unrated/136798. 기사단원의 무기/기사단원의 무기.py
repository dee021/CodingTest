def solution(number, limit, power):
    arr = [1 for _ in range(number+1)]
    answer = 0
    for i in range(2, number+1):
        for j in range(i, len(arr), i):
            arr[j] += 1
    for i in range(1, len(arr)):
        answer += arr[i] if arr[i] <= limit else power
    return answer