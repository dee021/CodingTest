arr = [x**2 for x in range(1, 101)]
m = int(input())
n = int(input())
arr = [x for x in arr if x >= m and x <= n]
if len(arr): print(sum(arr), arr[0], sep='\n')
else: print(-1)