h, m, s = map(int, input().split(':'))
p = h*60*60 + m*60 + s
h, m, s = map(int, input().split(':'))
c = h*60*60 + m*60 + s
if c <= p:
    c += 24*60*60
c -= p
print('{:0>2}:{:0>2}:{:0>2}'.format(c//3600, c%3600//60, c%60))