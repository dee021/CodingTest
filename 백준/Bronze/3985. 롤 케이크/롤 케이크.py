l, n = int(input()), int(input())
arr = [0 for _ in range(l)]
o, t = [0,0], [0,0]
for i in range(n):
    s, e = map(int, input().split())
    if e-s+1 > o[0]:
        o = [e-s+1, i+1]
        
    for j in range(s-1, e):
        if not arr[j]:
            arr[j] = i+1

cnt = arr.count
for i in range(1,n+1):
    if cnt(i) > t[0]:
        t = [cnt(i), i]
print(o[1], t[1], sep='\n')