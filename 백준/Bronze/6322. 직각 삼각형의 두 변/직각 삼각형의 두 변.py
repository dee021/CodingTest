t = 0
l = {0:'a', 1:'b', 2:'c'}

def solAB(n, c):
    if n >= c:
        return False
    return c**2 - n**2
def solC(a, b):
    return a**2 + b**2

while True:
    t += 1
    if t > 1:
        print()
    arr = list(map(int, input().split()))
    if arr.count(0) == 3:
        break
    print('Triangle #'+str(t))
    s = l[arr.index(-1)]
    if s == 'c':
        ans = solC(arr[0], arr[1])
    else:
        arr.remove(-1)
        ans = solAB(*arr)
        if not ans:
            print('Impossible.')
            continue
    print(s, '=', '%0.3f' %(ans**(1/2)))