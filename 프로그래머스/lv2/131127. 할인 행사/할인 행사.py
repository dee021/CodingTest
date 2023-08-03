from collections import Counter

def solution(want, number, discount):
    ans = 0
    wd = Counter({w:n for w, n in zip(want, number)})
    dc_l = len(discount)
    ws_cnt = sum(number)
    for i in range(dc_l - ws_cnt + 1):
        ps = Counter(discount[i:i+ws_cnt])
        ck = wd - ps
    
        if sum(ck.values()) == 0:
            ans += 1
    return ans