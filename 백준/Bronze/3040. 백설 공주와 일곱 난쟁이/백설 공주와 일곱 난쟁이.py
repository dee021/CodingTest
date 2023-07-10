arr = [int(input()) for _ in range(9)]
s = sum(arr)

for i in range(9):
    for j in range(i):
        if s - arr[i] - arr[j] == 100:
            print(*[arr[x] for x in range(9) if x not in [i, j]], sep='\n')
            exit(0)