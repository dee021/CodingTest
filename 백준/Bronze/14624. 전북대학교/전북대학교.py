n = int(input())

if n%2:
    arr = ['*']*n
    r, l = n//2, 0
    print('*'*n)
    while r >= 0:
        print(' '*r + '*', end='')
        if l:
            print(' '*l + '*', end='')
            l += 2
        else:
            l += 1
        print()
        r -= 1  
else:
    print('I LOVE CBNU')