def solution(prices):
    answer = [0 for _ in range(len(prices))]
    
    for i in range(len(prices)-2, -1, -1):
        cnt = 0
        for j in range(i+1, len(prices)):
            cnt += 1
            if prices[i] > prices[j]:
                break
        answer[i] = cnt
    return answer
