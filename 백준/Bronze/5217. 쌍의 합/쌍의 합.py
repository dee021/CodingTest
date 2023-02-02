for _ in range(int(input())):
    num = int(input())
    ans = 'Pairs for %d:' %num
    for i in range(1, num//2+1):
        if num-i != i:
            if i - 1:
                ans += ','
            ans += ' {} {}'.format(i, num-i)
    print(ans)