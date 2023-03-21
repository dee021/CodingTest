def solution(arr1, arr2):
    answer = [[] for _ in range(len(arr1))]
    
    for r in range(len(arr1)):
        for c in range(len(arr2[0])):
            t = 0
            for k in range(len(arr1[0])):
                t += arr1[r][k] * arr2[k][c]
            answer[r].append(t)
    print(answer)
    return answer