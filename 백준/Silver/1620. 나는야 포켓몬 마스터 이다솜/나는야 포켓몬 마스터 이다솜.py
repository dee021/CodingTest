import sys

n,m = map(int,input().split())
# n: 도감, m:문제 <= 100000
s = {};label=1
for i in range(n):
    temp = sys.stdin.readline().strip()
    s[temp] = str(label)
    s[str(label)] = temp
    label+=1

for i in range(m):
    temp = sys.stdin.readline().strip()
    print(s[temp])