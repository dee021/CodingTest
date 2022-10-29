arr = [int(input()) for _ in range(5)]
arr.sort()

print(sum(arr)//5, arr[2], sep='\n')