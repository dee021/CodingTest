M = 1_000_000_009
n = int(input())
three = [0,0,2]

for i in range(2, n+1):
    three.append((three[-1]*3)%M)

print(three[n])