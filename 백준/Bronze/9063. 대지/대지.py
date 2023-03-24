import sys
input = sys.stdin.readline

arr = [list(map(int, input().split())) for _ in range(int(input()))]
arr = [sorted(x) for x in zip(*arr)]

w, h = arr[0][-1] - arr[0][0], arr[1][-1] - arr[1][0]
print(w*h)