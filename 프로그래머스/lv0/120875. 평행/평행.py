def solution(dots):
    def line(a, b, c, d):
        l1 = (dots[a][1]-dots[b][1])/(dots[a][0]-dots[b][0])
        l2 = (dots[c][1]-dots[d][1])/(dots[c][0]-dots[d][0])
        return int(l1 == l2)

    answer = max(line(0,1,2,3),line(0,2,1,3), line(0,3,1,2))
    return answer