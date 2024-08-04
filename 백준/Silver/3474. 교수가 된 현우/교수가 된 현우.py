import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    cnt = 0
    while n >= 5:
        cnt += n//5
        n //= 5
    print(cnt)