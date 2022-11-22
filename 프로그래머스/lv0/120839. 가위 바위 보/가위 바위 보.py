def solution(rsp):
    win = {'0': '5', '2':'0', '5':'2'}
    answer = ''.join(map(lambda x:win[x], rsp))
    return answer