import sys
input = sys.stdin.readline

def sol():
    for r in range(n):
        for c in range(r+1, n):
            if arr[r][c] != arr[c][r]:
                return 'NO'
    return 'YES'

n = int(input())
arr = [list(input().strip()) for _ in range(n)]
print(sol())