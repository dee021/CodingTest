import math

a,b,c = map(int,input().split())
try:
    if a/(c-b) >0:
        if a/(c-b)%1 >0:
            print(math.ceil(a/(c-b)))
        else:
            print(int(a/(c-b))+1)
    else:
        print(-1)
except:
    print(-1)