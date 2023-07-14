arr = [x for x in range(1, 21)]
for _ in range(10):
    s, e = map(int, input().split())
    arr[s-1:e] = reversed(arr[s-1:e])   
print(*arr)