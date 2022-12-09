def solution(s):
    nlst = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    answer, num = '', ''
    for c in s:
        if ord(c) < 65:
            answer += c
        else:
            num += c
            if nlst.count(num):
                answer += str(nlst.index(num))
                num = ''
    return int(answer)