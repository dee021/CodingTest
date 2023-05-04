def solution(numLog):
    o = {1:'w', -1:'s', 10:'d', -10:'a'}
    ans = ''
    for i in range(1, len(numLog)):
        ans += o[numLog[i] - numLog[i-1]]
    return ans