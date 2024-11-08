import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
lst = [[arr[0], 1]]
ans = 1
for i in range(1, n):
    flag = 0
    for j in range(len(lst)):
        if arr[i] <= lst[j][0]:
            lst[j][0] += arr[i]
            lst[j][1] += 1
            flag = 1
            ans = max(ans, lst[j][1])
    if not flag:
        lst.append([arr[i], 1])

print(ans)