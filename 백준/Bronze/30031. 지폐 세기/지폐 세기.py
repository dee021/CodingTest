import sys
input = sys.stdin.readline

ans = 0
d = {'136':1000, '142':5000, '148':10000, '154':50000}
for _ in range(int(input())):
    ans += d[input().split()[0]]
print(ans)