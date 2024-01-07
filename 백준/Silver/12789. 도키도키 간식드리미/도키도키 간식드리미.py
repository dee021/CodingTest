def sol():
    cur, idx = 1, 0
    stack = []
    while idx < n or stack:
        if idx < n and arr[idx] == cur:
            idx += 1
            cur += 1
        elif stack and stack[-1] == cur:
            cur += 1
            stack.pop()
        else:
            if idx >= n:
                return False
            stack.append(arr[idx])
            idx += 1
    if cur == n + 1:
        return True
    return False


n = int(input())
arr = list(map(int, input().split()))
res = sol()
print(res and 'Nice' or 'Sad')