def sol(k):
    if k > w*h:
        return [0]
    num, rnd, d = 0, 0, 0
    cur = [0,1]
    while num < w*h:
        if num + [h, w][d%2] - rnd < k:
            num += [h, w][d%2] - rnd
            cur[d%2] += dr[d] * ([h, w][d%2] - rnd)
            d = (d+1)%4
            if d % 2 == 1:
                rnd += 1
        else:
            while num < k:
                num += 1
                cur[d%2] += dr[d]
            return cur[::-1]
        
dr = [1,1,-1,-1]
w, h = map(int, input().split())
k = int(input())
res = sol(k)
print(*res)