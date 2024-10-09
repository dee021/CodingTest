import sys
input = sys.stdin.readline

n = int(input())
length = set()
ans = 0
for _ in range(n):
    for l in list(map(int, input().split())):
        if l in length:
            ans = 1
            break
        length.add(l)
    if ans:
        break
    
print(ans)