import sys
input = sys.stdin.readline

ans = 1
for i in range(int(input())):
    ans += int(input()) -1
print(ans)