n = int(input())
a=list(input().split())
count=0;
for i in a:
    if int(i)==2 or int(i)==3:
        count+=1
    elif int(i)==1 or (int(i)%2)==0:
        continue
    else:
        for j in range(3,int(i),2):
            if (int(i)%int(j))==0:
                count-=1
                break
        count+=1
print(count)