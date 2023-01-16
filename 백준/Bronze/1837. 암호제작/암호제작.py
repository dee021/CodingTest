pq, k = map(int, input().split())
n = [x for x in range(2, k) if x == 2 or x%2 != 0]

for i in n:
    if pq%i == 0:
        print('BAD', i)
        exit(0)
print('GOOD')