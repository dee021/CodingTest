def isGW(string):
    groupword=set()
    count=0;before=''
    for j in string:
        if before!=j:
            groupword.add(j)
            if count != len(groupword):
                count+=1
                before=j
            else:
                return 0
    return 1

n=int(input())
wordcount=0
for i in range(n):
    wordcount+=isGW(input())
        
print(wordcount)
