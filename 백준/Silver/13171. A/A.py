def sol(x):
    if x in ax:
        return ax[x]
    elif x % 2 == 0:
        ax[x] = (sol(x//2)**2)%M
    else:
        ax[x] = (sol(x//2)**2*a)%M
    return ax[x]%M

M = 1000000007
a = int(input())
x = int(input())
ax = {1:a%M, 2:a*a%M}

print(sol(x))