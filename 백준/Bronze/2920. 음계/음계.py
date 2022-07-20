mel = list(map(int,input().split()))

ans = [0 for _ in range(8)]

for i in range(7):
    if mel[i] + 1 == mel[i+1]:
        ans[i] = 1
    elif mel[i] -1 == mel[i+1]:
        ans[i] = -1

ans = sum(ans)
if ans == 7:
    print('ascending')
elif ans == -7:
    print('descending')
else:
    print('mixed')