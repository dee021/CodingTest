d, k = map(int, input().split())
fibo = [1,1]
for i in range(d):
    fibo.append(fibo[i]+fibo[i+1])
f, s = fibo[d-3], fibo[d-2]
for j in range(k//s, 0, -1):
    for i in range(1, j):
        if f*i + s*j == k:
            print(i, j, sep='\n')
            exit(0)