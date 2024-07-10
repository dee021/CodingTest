import sys
input = sys.stdin.readline

n = int(input())
candy = []
ans = [0 for _ in range(n)]
tmp = 0
for i in range(n-2):
    candy.append(int(input()))
    if i%2:
        tmp += candy[-1]
    else:
        tmp -= candy[-1]
candy.append(int(input()))
candy.append(int(input()))
tmp += sum(candy[-2:])
ans[-1] = tmp//2
ans[0] = candy[-1] - ans[-1]
for i in range(1, n-1):
    ans[i] = candy[i-1] - ans[i-1]
print(*ans, sep='\n')