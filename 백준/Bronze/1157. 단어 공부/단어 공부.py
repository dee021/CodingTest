a=input().upper()
uni=set(a); uni=list(uni)
count=list([0]*len(uni))

for i in range(len(uni)):
    count[i]= a.count(uni[i])
    
index=count.index(max(count))

if index != (len(count)-1):
    for i in range(index+1,len(count)):
        if count[i]==max(count):
            res='?'
            break;
        res=uni[index]
else:
    res=uni[index]
print(res)