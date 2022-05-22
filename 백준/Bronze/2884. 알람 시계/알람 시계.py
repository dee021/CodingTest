hh,mm=input().split()
mi=int(hh)*60+int(mm)-45
hh=mi//60; mm=mi%60
if hh<0:
    print(24+hh,mm)
else:
    print(hh,mm)
