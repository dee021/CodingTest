import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    arr = sorted([list(map(int, input().split())) for _ in range(n)])
    ans = [arr[0][1]]
    for p in range(1, n):
        if ans[-1] > arr[p][1]:
            ans.append(arr[p][1])
    print(len(ans))