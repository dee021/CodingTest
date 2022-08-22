n = [0 for _ in range(int(input())+1)]
n[1] = 1
for i in range(len(n)-2):
    n[i+2] = n[i] + n[i+1]
print(2*(n[-1]+2*n[-2]+n[-3]) if len(n) > 2 else 4)
