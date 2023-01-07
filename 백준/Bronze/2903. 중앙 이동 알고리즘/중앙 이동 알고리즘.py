arr = [2]
n = int(input())

for i in range(n):
    arr.append(2*arr[i]-1)
print(arr[n]**2)