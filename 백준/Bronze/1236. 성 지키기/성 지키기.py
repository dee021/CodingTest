x = 0
n, m = map(int, input().split())
arr = [0 for _ in range(m)]
for _ in range(n):
    temp = input()
    if not temp.count('X'):
        x += 1
    for i in range(m):
        if temp[i] == '.':
            arr[i] += 1
        else: arr[i] = -50
arr = list(filter(lambda x: x>0, arr))
print(max(x, len(arr)))