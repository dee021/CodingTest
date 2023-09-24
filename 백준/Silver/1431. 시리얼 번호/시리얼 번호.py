arr = [input() for _ in range(int(input()))]
print(*sorted(arr, key=lambda x:(len(x), sum([int(x[i]) for i in range(len(x)) if x[i].isnumeric()]), x)), sep='\n')