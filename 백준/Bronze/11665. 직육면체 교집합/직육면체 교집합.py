import sys
input = sys.stdin.readline

si, sj, sk, ei, ej, ek = 0, 0, 0, 1001, 1001, 1001
for _ in range(int(input())):
    tmp = list(map(int, input().split()))
    si = max(si, tmp[0])
    sj = max(sj, tmp[1])
    sk = max(sk, tmp[2])
    ei = min(ei, tmp[3])
    ej = min(ej, tmp[4])
    ek = min(ek, tmp[5])
if ei > si and ej > sj and ek > sk:
    print((ei-si)*(ej-sj)*(ek-sk))
else:
    print(0)