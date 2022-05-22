n=int(input())

for i in range(n):
    h, w, g = input().split()
    g=int(g);h=int(h)
    xx=g//h
    if (g%h)==0:
        if len(str(xx))==1:
            xx='0'+str(xx)
        print(h,xx,sep='')
    else:
        xx=str(xx+1)
        if len(xx)==1:
            xx='0'+xx
        print(str(g%h),xx,sep='')