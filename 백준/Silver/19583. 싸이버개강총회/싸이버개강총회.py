import sys
input = sys.stdin.readline

def time(t):
    h, m = map(int, t.split(':'))
    return h*60 + m

s, e, q = map(time, input().strip().split())
students = {}
cnt = 0
while True:
    try:
        t, n = input().strip().split()
    except:
        break
    t = time(t)
    if t <= s:
        students[n] = 0
    elif e <= t <= q and n in students:
        cnt += 1
        students.pop(n)
    elif t > q:
        break
print(cnt)