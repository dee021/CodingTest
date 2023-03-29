import sys
input = sys.stdin.readline

for _ in range(int(input())):
    ans = [0, 0]
    for _ in range(int(input())):
        w, c = map(int, input().split())
        if ans[0] <= w/c:
            ans = ans = [[w/c, c], ans][ans[0] == w/c and ans[1] < c]
    print(ans[1])