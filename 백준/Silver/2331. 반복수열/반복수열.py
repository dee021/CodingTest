a, p = input().split()
arr = [int(a)]; p = int(p)

while True:
    e = 0
    for x in a:
        e += int(x)**p
    if arr.count(e):
        del arr[arr.index(e):]
        print(len(arr))
        break
    arr.append(e)
    a = str(e)