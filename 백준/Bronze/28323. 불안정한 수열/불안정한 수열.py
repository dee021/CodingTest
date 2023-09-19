n = int(input())
arr = list(map(int, input().split()))
ans = [arr[0]]; odd = arr[0]%2

for i in range(1, n):
    if odd and not arr[i]%2:
        ans.append(arr[i])
        odd ^= 1
    elif not odd and arr[i]%2:
        ans.append(arr[i])
        odd ^= 1
print(len(ans))