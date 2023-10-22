import sys
input = sys.stdin.readline
print = sys.stdout.write

L = 1000000
prime = [True for _ in range(L+1)]
for i in range(3, int(L**0.5)+1, 2):
    for j in range(3, L, 2):
        if i*j > L:
            break
        prime[i*j] = False

while True:
    n = int(input())
    if not n:
        break
    for p in range(3, n//2+1, 2):
        if prime[p] and prime[n-p]:
            print('{} = {} + {}'.format(n, p, n-p) + '\n')
            break
    else:
        print("Goldbach's conjecture is wrong.\n")