hh,mm=input().split()
ti=int(hh)*60+int(mm)+int(input())
hh=ti//60;mm=ti%60
if hh>=24:
    print(hh-24,mm)
else:
    print(hh,mm)