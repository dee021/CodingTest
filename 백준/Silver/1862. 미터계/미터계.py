from collections import deque

def conv(num):
    res = num.popleft()
    while num:
        res *= 9
        res += num.popleft()
    return res

bf, af = '56789', '45678'
table = str.maketrans(bf, af)
n = deque(list(map(int, input().strip().translate(table))))
print(conv(n))