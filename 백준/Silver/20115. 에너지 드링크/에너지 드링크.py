def sol():
    while len(arr) > 1:
        arr[0] += arr.pop()/2
    return arr[0]

n = int(input())
arr = sorted(map(int, input().split()), reverse=True)
print(sol())