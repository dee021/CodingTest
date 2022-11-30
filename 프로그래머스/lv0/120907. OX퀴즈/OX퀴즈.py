def solution(quiz):
    def res(s):
        q, a  = s.split('=')
        return eval(q) == int(a)
    answer = [["X", "O"][int(ans)] for ans in list(map(res, quiz))]
    return answer