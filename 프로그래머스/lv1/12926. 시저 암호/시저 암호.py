def solution(s, n):
    def ch(c):
        if c == ' ':
            return ' '
        if ord(c) <= 90 and ord(c) + n > 90:
            c = chr(ord(c) - 26 + n)
        elif ord(c) <= 122 and ord(c) + n > 122:
            c = chr(ord(c) - 26 + n)
        else:
            c = chr(ord(c) + n)
        return c
    answer = list(map(ch, s))
    return ''.join(answer)