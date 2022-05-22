m=input()
n=m;count=1

if int(m)<10:
    m='0'+m
    n='0'+n

num=int(n[0])+int(n[1])
n=n[1]+str(num)[-1]

while n!=m:
    count+=1
    
    num=int(n[0])+int(n[1])
    n=n[1]+str(num)[-1]

print(count)
