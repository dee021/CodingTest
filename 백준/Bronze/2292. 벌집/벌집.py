n = int(input())

sumn=[0,1]
temp = n-1

if n==1:
    print(1)
elif n<=7:
    print(2)
else:
    i=2
    while (sumn[i-1]*6)<=temp:
        sumn.insert(i,i+sumn[i-1])
        i+=1
    for i in range(0,len(sumn)+1):
        if sumn[i-1]*6 <= temp and temp<=sumn[i]*6:
            print(i+1)
            break