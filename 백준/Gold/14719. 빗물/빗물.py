h, w = map(int, input().split())
arr = list(map(int, input().split()))
temp1, temp2 = [0 for _ in range(w)], [0 for _ in range(w)]
l, r = arr[0], arr[-1]
for i in range(w):
    l = max(l, arr[i])
    temp1[i] = l
    r = max(r, arr[w-i-1])
    temp2[w-i-1] = r
print(sum([min(temp1[x], temp2[x])-arr[x] for x in range(w)]))   