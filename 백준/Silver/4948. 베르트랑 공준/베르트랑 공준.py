import sys
n = int(sys.stdin.readline())

# 소수 구하기
numlist = [x for x in range(2,246913,1) if (x%2)!=0 or x==2]


for i in numlist:
    if i in numlist:
        numlist = [x for x in numlist if (x%i)!=0 or x==i]
    if i>((246913)**0.5):
        break

while n:
    prime = [x for x in numlist if x>n and x<= 2*n]
    print(len(prime))
    n = int(sys.stdin.readline())