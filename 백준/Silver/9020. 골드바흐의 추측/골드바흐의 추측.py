import sys
n = int(input())

# 소수 구하기
numlist = [x for x in range(2,10000,1) if (x%2)!=0 or x==2]

for i in numlist:
    if i in numlist:
        numlist = [x for x in numlist if (x%i)!=0 or x==i]
    if i>((10000)**0.5):
        break

# 각 테스트 케이스 처리
for i in range(n):
    m = int(sys.stdin.readline())
    prime = [x for x in numlist if x<= m]
    smprime = [x for x in numlist if x<= m/2]
    smprime.reverse()
    for j in smprime:
        if (m-j) in prime:
            print(j,m-j)
            break