import sys
input = sys.stdin.readline

n = int(input())
arr = []
sum_arr = []
for k in list(map(int, input().split())):
    arr.append(k)
    if sum_arr:
        sum_arr.append(sum_arr[-1] + k)
    else:
        sum_arr.append(k)

    
case1 = 0
case2 = arr[0] * 2
case3 = 0

for i in range(1, n-1):
    case1 = max(case1, sum_arr[n-1] - sum_arr[i] + sum_arr[n-1] - arr[0] - arr[i])
    case2 = max(case2, abs(sum_arr[n-2]+sum_arr[i-1]-arr[i]))
    case3 = max(case3, sum_arr[i] - sum_arr[0] + sum_arr[n-2] - sum_arr[i-1])

print(max(case1, case2, case3))