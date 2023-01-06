arr = [input() for _ in range(int(input()))]
k = int(input())
if k == 1:
    print(*arr, sep='\n')
elif k == 2:
    print('\n'.join([x[::-1] for x in arr]))
else:
    print(*reversed(arr), sep='\n')