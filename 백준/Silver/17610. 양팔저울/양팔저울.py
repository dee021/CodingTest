def sol(idx, res):
    ans.discard(res)
        
    if idx == k:
        return
        
    sol(idx + 1, res + arr[idx])
    sol(idx + 1, res - arr[idx])
    sol(idx + 1, res)

k = int(input())
arr = list(map(int, input().split()))
ans = set(range(1,sum(arr)+1))
sol(0, 0)
print(len(ans))