n = int(input())
arr = []; k = 666

while len(arr) < n:
    if str(k).count('666'):
        arr.append(k)
    k += 1
print(arr[n-1])