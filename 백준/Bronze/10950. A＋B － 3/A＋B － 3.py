n = int(input())
a=[];i=0
while i<n:
    a.insert(i,input())
    i+=1
for i in range(0,len(a)):
    temp1,temp2=a[i].split()
    print(int(temp1)+int(temp2))