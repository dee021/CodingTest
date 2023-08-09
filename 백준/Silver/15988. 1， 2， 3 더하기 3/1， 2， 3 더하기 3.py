arr = [0 for _ in range(1000000)]
M = 1000000009
arr[:3] = [1,2,4]
for i in range(1000000-3):
    arr[i+3] = (arr[i] + arr[i+1] + arr[i+2])%M

for _ in range(int(input())):
    print(arr[int(input())-1])