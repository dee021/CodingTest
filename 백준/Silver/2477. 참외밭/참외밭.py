one = [1,2,3,4]

melon = int(input())
path=[];val = []
for i in range(6):
    d,l = map(int,input().split())
    if d in path:
        one.remove(d)
    path.append(d) # 경로
    val.append(l) # 길이

 # 시작 위치 이동
while not set(path[:2]).issubset(one):
    path.append(path.pop(0))
    val.append(val.pop(0))
    
big = val[0] * val[1]
small = val[3] * val[4]
res = melon * (big-small)  
print(res)  