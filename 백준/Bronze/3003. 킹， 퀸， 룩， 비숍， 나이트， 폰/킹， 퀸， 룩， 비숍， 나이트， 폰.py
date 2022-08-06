ans = [1, 1, 2, 2, 2, 8]
arr = list(map(int, input().split()))
    
print(' '.join(list(str(ans[x]-arr[x]) for x in range(6))))