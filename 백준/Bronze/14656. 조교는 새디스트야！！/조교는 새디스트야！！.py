input()
arr = list(map(int, input().split()))
print(len(list(filter(lambda x: arr.index(x)+1 != x, arr))))