arr = [0]*31
for i in range(1, 31):
    arr[i] = 2*arr[i-1]+1

for _ in range(int(input())):
    print(arr[int(input())])