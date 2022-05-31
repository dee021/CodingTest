import sys
n = int(input())
xy=[]

for i in range(n):
    temp = list(map(int,sys.stdin.readline().split()))
    temp.reverse()
    xy.append(temp)
   

xy.sort()


for i in range(len(xy)):
    print('{0} {1}'.format(xy[i][1],xy[i][0]))