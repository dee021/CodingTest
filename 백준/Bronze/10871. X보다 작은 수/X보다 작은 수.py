a,b=map(int,input().split())
mli=[]
mli.extend(input().split())
for i in mli:
    if int(i)<b:
        print(i,end=' ')