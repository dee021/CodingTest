n=int(input())

for i in range(n):
    f = int(input())
    no = int(input())
    room = [x for x in range(1,no+1)]
    
    for j in range(1,f+1):
        for k in range(no):
            if k==0:
                room[k]=1
            else:
                room[k]=room[k-1]+room[k]
    print(max(room))