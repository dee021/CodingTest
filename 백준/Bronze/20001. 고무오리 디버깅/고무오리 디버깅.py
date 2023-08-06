q = 0
input()

while True:
    s = input().split()
    if s[-1] == '끝':
        break
    if s[0] == '문제':
        q += 1
    else:
        q += [2, -1][bool(q)]
print(['고무오리야 사랑해', '힝구'][bool(q)])