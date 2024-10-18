import sys
input = sys.stdin.readline

w, h = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(h)]

for r in range(h):
    for c in range(w):
        if arr[r][c]:
            if r and c:
                arr[r][c] = max(arr[r-1][c], arr[r][c-1])
            elif r:
                arr[r][c] = arr[r-1][c]
            elif c:
                arr[r][c] = arr[r][c-1]
            
print(arr[h-1][w-1] and 'Yes' or 'No')