from collections import Counter

arr = [int(input()) for _ in range(10)]
print(sum(arr)//len(arr))
arr = Counter(arr)
print([x for x in arr.keys() if arr[x] == max(arr.values())][0])