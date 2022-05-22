def han(n):
    count = 0
    for i in range(1,n+1):
        if i <100:
            count+=1
        elif i<1000:
            temp = str(i)
            d=int(temp[0])-int(temp[1])
            if int(temp[1])-int(temp[2]) == d:
                count+=1
    print(count)
han(int(input()))