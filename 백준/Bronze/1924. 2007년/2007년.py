import datetime

days = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']

m, d = map(int, input().split())
print(days[datetime.date(2007, m, d).weekday()])