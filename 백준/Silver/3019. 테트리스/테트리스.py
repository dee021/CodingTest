shp = [0,
       [[0], [0,0,0,0]],
       [[0,0]],
       [[0,0,1],[1,0]],
       [[1,0,0],[0,1]],
       [[0,0,0],[0,1],[1,0,1],[1,0]],
       [[0,0,0],[0,0],[0,1,1],[2,0]],
       [[0,0,0],[0,0],[1,1,0],[0,2]]]

c, p = map(int, input().split())
arr = list(map(int, input().split()))
ans = 0

         
for a in range(len(shp[p])):
    if len(shp[p][a]) == 1:
        ans += c
        continue
    for idx in range(c-len(shp[p][a])+1):
        tmp = arr[idx] - shp[p][a][0]
        for h in range(len(shp[p][a])):
            if tmp != arr[idx+h] - shp[p][a][h]:
                break
        else:
            ans += 1
print(ans)