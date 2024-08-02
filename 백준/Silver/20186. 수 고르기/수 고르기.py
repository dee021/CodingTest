import sys
input = sys.stdin.readline

n, k = map(int, input().split())
arr = []
for i, num in enumerate(map(int, input().split())):
    arr.append([num, i])
score = sorted(arr, key= lambda x:(-x[0], x[1]))[:k]
score.sort(key=lambda x:x[1])
ans = 0
for i in range(k):
    ans += score[i][0] - i
print(ans)