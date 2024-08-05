conv = lambda x: int(x[::-1])

n, *arr = open(0).read().split()
arr = map(conv, arr)
print(*sorted(arr), sep='\n')