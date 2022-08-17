import sys
maxV = 0;cnt = 0
stick = [int(sys.stdin.readline()) for _ in range(int(input()))]

for i in reversed(stick):
    if i > maxV:
        cnt += 1
        maxV = i

print(cnt)