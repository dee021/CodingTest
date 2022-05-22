n=int(input())

x=1 #분모
y=0
bignum=1 # 찾을 위치의 다음 대각선(우측위->좌측아래) 라인

while n>bignum and n>1:
    x+=1
    y+=1
    bignum = y + bignum
    
if n==bignum:
    if n == 1:
        print('1/1')
    else:
        if (x%2)==0:
            print('1/'+str(x))
        else:
            print(str(x)+'/1')
else:
    if(x%2)==1:
        y=x-1
        x=1
        bignum-=1 # ex: bignum=7이면 bignum=6으로 변경
        while bignum!=n:
            y-=1
            x+=1
            bignum-=1
        print(str(y)+'/'+str(x))
    else:
        x-=1
        y=1
        bignum-=1
        while bignum!= n:
            x-=1
            y+=1
            bignum-=1
        print(str(y)+'/'+str(x))