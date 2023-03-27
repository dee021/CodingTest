ans = [0,0]
for n in input():
    ans[int(n)] += 1
print('0'*(ans[0]//2)+'1'*(ans[1]//2))