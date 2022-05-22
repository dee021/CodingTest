n=int(input())
for i in range(n):
    temp=input().split()
    temp.reverse()
    size=int(temp.pop())
    count=0;
    for j in range(size):
        temp[j]=int(temp[j])
    mean=sum(temp)/size
    count = [1 for j in range(size) if temp[j]> mean]
    rate = len(count)/size*100
    print('%0.3f' %rate + '%')
