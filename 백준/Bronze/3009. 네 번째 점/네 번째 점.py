mylist=[]
mylist.append(list(map(int,input().split())))
mylist.append(list(map(int,input().split())))
mylist.append(list(map(int,input().split())))

mylist = [list(x) for x in zip(*mylist)]
chk=0
for i in mylist:
    for j in i:
        if i.count(j) == 1:
            if chk == 0:
                chk +=1
                print(j,end=' ')
            else:
                print(j)