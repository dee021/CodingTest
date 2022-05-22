def selfNum():
    arr=list([0]*10000)
    for i in range(1, 10001):
        res=i;strnum=str(i)
        for j in range(len(strnum)):
            res+=int(strnum[j])
        if res<=10000:
            arr[res-1]+=1
    for i in range(10000):
        if arr[i]==0:
            print(i+1)

selfNum()
