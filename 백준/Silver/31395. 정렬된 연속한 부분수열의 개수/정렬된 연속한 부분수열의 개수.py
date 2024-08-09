import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
q = []
ans = 0
tmp = 0
for j in range(n):
    if not q or q[-1] < arr[j]:
        q.append(arr[j])
        tmp += 1
    else:
        ans += tmp * (tmp+1) // 2
        q = [arr[j]]
        tmp = 1
ans += tmp * (tmp+1) // 2
print(ans)