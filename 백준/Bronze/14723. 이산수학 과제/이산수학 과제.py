n = int(input())
for i in range(1,47):
    if sum(range(i)) >= n >= sum(range(i-1)):
        m = sum(range(i-1))
        for j in range(1,i+1):
            m += 1
            if n == m:
                print(i-j,j)
                break
    if sum(range(i-1)) > n:
        break