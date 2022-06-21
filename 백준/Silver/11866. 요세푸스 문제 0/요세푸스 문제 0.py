n, k = map(int, input().split())

circle = [x for x in range(1,n+1)]
delete = []
while circle:
    if len(circle) >= k:
        delete.append(circle[k-1])
        circle = circle[k:] + circle[0:k-1]
    else:
        s = len(circle)
        m = k//len(circle) + 2
        circle = circle * m
        delete.append(circle[k-1])
        circle = [x for x in circle[k-1:] if x != circle[k-1]]
        circle = circle[:s-1]
       
print('<',', '.join([str(x) for x in delete]), '>', sep='')
