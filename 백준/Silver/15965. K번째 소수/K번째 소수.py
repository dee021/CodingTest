k = int(input())
if k == 1:
    print(2)
prime = [1 if x == 2 or x % 2 else 0 for x in range(min(k**2, 7368787)+1)]
prime[1] = 0
B = len(prime) -1
cnt = 1

for i in range(3, B+1, 2):
    if not prime[i]:
        continue
    cnt += 1
    if k == cnt:
        print(i)
        break
    if i**2 > B:
        continue
    for j in range(2, B):
        if i*j > B:
            break
        prime[i*j] = 0