n = int(input())

inx=list(map(int,input().split()))
numlist = dict.fromkeys(sorted(inx))

def mapx(num):
    return numlist[num]

label = 0
for i in numlist:
    numlist[i]=label
    label+=1
outx=list(map(mapx,inx))

for i in outx:
    print(i,end=' ')