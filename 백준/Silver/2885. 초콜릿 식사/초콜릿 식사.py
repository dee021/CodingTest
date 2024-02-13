
def sol(d, k):
    cnt = 0
    while k > 0:
        cnt += 1
        if k >= d//2:
            k -= d//2
        d //= 2
    return cnt

k = int(input())

for e in range(21):
    if k < 2**e:
        print(2**e, end=' ')
        print(sol(2**e, k))
        break
    elif k == 2**e:
        print(2**e, 0)
        break