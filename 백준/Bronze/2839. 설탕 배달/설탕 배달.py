n=int(input());temp=n
five=0;three=0
flag=1

while flag:
    if temp>=5:
        temp-=5
        five+=1
    elif temp>=3:
        temp-=3
        three+=1
    else:
        if temp!=0 and five>0:
            five-=1
            temp+=5
            temp-=3
            three+=1
        else:
            flag=0

print(five+three if temp==0 else -1)