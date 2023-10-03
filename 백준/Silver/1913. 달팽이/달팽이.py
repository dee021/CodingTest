import sys
print = sys.stdout.write

def sol(n, num):
    k = n**2
    x, y = 0, -1
    d = 0
    while k > 0:
        dx, dy = dr[d]
        if 0 <= x+dx < n and 0 <= y + dy <n and not arr[y+dy][x+dx]:
            x += dx; y += dy
            arr[y][x] = str(k)
            if k == num:
                num = [str(y+1), str(x+1)]
            k -= 1
        else:
            d = (d+1)%4
    return num

dr = [[0, 1], [1, 0], [0, -1], [-1, 0]]
n = int(input())
num = int(input())
arr = [[0 for _ in range(n)] for _ in range(n)]
ans = sol(n, num)
for i in range(n):
    print(' '.join(arr[i])+'\n')
print(' '.join(ans))