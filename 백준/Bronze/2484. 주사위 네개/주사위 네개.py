ans = 0
for _ in range(int(input())):
    arr = sorted(map(int, input().split()))
    l = len(set(arr))
    if l == 1:
        ans = max(ans, 50000+arr[0]*5000)
    elif arr.count(arr[1]) == 3:
        ans = max(ans, 10000+arr[1]*1000)
    elif l == 3:
        ans = max(ans, 1000+(arr[1] if arr.count(arr[1]) == 2 else arr[2])*100)
    elif l == 4:
        ans = max(ans, arr[3]*100)
    else:
        ans = max(ans, 2000+arr[0]*500+arr[3]*500)
print(ans)