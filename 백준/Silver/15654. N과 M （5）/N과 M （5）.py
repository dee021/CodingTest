from itertools import permutations

n, m = map(int, input().split())
arr = list(map(int, input().split()))
arr = sorted(list(permutations(arr, m)))

for i in arr:
    print(' '.join(list(map(str, i))))