import sys
input = sys.stdin.readline

cnt = 0
arr = []
n = int(input())
for i in range(n):
    arr.append(list(map(int, input().split())))
arr.sort(key = lambda x: (x[1], x[0])) # 끝시간, 시작시간 순 정렬

lastend = -1
for start, end in arr:
    if start >= lastend:
        cnt += 1
        lastend = end

print(cnt)   