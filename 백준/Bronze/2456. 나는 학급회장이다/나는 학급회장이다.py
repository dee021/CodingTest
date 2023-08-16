n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
arr = [[sum(x), *list(map(x.count,[3,2,1]))] for x in zip(*arr)]
ans = [arr.index(value) for value in sorted(arr, key = lambda x: (-x[0], -x[1], -x[2], -x[3]))]

if arr[ans[0]] != arr[ans[1]]:
    print(ans[0]+1, arr[ans[0]][0])
else:
    print(0, arr[ans[0]][0])