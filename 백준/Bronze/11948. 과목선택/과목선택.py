arr = list(int(input()) for _ in range(4))
arr.remove(min(arr))
arr = sum(arr) + max(map(int, [input() for _ in range(2)]))
print(arr)