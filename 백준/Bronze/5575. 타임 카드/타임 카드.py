import datetime

for _ in range(3):
    h1, m1, s1, h2, m2, s2 = map(int, input().split())
    ans = str(datetime.timedelta(hours = h2-h1, minutes = m2-m1, seconds = s2-s1)).split(':')
    ans = map(int, ans)
    print(*ans)