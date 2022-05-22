res=1
for i in range(3):
    res*=int(input())
res=str(res)
for i in range(0,10):
    print(res.count(str(i)))