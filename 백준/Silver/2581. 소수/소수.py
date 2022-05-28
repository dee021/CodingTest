m = int(input())
n = int(input())
prime = []

if m <= 2 and n >= 2:
    prime.append(2)

while m <= n:
    for i in range(2,m):
        if (m % i) == 0:
            break;
        elif i==(m-1):
            prime.append(m)
    m +=1


print(sum(prime), min(prime), sep='\n') if len(prime) >= 1 else print(-1)

