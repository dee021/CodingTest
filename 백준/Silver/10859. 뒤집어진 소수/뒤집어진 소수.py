def isPrime(k):
    if k < 2 or (k > 2 and k%2 == 0):
        return 'no'
    if k == 2:
        return 'yes'
    p = 3
    while p*p <= k:
        if k%p == 0:
            return 'no'
        p += 2
    return 'yes'

def sol():
    res1 = isPrime(int(''.join(n)))
    for i in range(len(n)):
        if n[i] in '347':
            return 'no'
        n[i] = number[int(n[i])]
    res2 = isPrime(int(''.join(n[::-1])))
    if res1 == res2:
        return res1
    return 'no'

number = list(map(str, [0,1,2,0,0,5,9,0,8,6]))
n = list(input().strip())
print(sol())