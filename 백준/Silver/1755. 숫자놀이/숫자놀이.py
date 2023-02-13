arr = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
n, m = map(int, input().split())
ans = sorted([str(x) for x in range(n, m+1)], key=lambda k:' '.join(arr[int(i)] for i in k))
for i in range(len(ans)//10+bool(len(ans)%10)):
    print(' '.join(ans[:min(len(ans),10)]))
    del ans[:min(len(ans),10)]