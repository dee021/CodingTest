B = 1003001
n = int(input())
prime = [True for _ in range(B+1)]
if n <= 2:
    print(2)
    exit(0)

for i in range(3, B+1, 2):
    if i >= n and prime[i] and str(i) == str(i)[::-1]:
        print(i)
        break
    if i**2 > B+1:
        continue
    if prime[i]:
        for j in range(2, B):
            if i*j > B:
                break
            prime[i*j] = False