x,y,w,h=map(int,input().split())

def mymin(here,size):
    return min(size-here,here)

print(min(mymin(x,w),mymin(y,h)))