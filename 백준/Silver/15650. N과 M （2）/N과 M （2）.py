n, m = map(int, input().split())

num = [str(x) for x in range(1,n+1)]
numlist = [x for x in num]

for i in range(m-1):
    numlist = [x+' '+y for x in numlist for y in num if y > x[-1]]

numlist.sort()
print('\n'.join(numlist))