n, k = map(int, input().split())
arr = list(map(int, input().split()))
s = [sum(arr[i:i+k]) for i in range(n-k+1)]
print(max(s))