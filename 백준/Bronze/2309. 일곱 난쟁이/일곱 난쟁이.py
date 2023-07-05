arr = [int(input()) for _ in range(9)]
s = sum(arr)

for i in range(9):
    for j in range(i+1, 9):
        if s - arr[i] - arr[j] == 100:
            del arr[j]
            break
    if len(arr) == 8:
        del arr[i]
        break
print(*sorted(arr), sep='\n')