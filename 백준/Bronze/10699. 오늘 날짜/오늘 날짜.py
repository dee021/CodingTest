import datetime
x = datetime.datetime.now() + datetime.timedelta(hours=9)
print(str(x).split()[0])