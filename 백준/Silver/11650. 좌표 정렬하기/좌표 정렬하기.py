import sys
n = int(input())
xy=[]

for i in range(n):
    xy.append(list(map(int,sys.stdin.readline().split())))

xy.sort()

for i in range(len(xy)):
    print('{0} {1}'.format(xy[i][0],xy[i][1]))