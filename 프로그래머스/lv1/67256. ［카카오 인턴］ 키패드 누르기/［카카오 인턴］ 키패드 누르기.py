def solution(numbers, hand):
    hand = hand[0].upper()
    h = [[3,1], [3,1]]
    l = [1,4,7]; r = [3,6,9]; c = [2,5,8,0]
    answer = ''
    for n in numbers:
        if n in l:
            answer += 'L'
            h[0] = [l.index(n), 1]
        elif n in r:
            answer += 'R'
            h[1] = [r.index(n), 1]
        else:
            ld = abs(h[0][0]-c.index(n)) + h[0][1]
            rd = abs(h[1][0]-c.index(n)) + h[1][1]
            if ld == rd:
                answer += hand
                h[hand == 'R'] = [c.index(n), 0]
            elif ld > rd:
                answer += 'R'
                h[1] = [c.index(n), 0]
            else:
                answer += 'L'
                h[0] = [c.index(n), 0]
    return answer