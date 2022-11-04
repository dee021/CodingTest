import sys
input = sys.stdin.readline

for _ in range(int(input())):
    recur = 0; ans = 1
    s = input().strip()
    l = len(s) - 1
    for i in range(len(s)):
        recur += 1
        if i >= l: break
        if s[i] != s[l]:
            ans = 0
            break
        l -= 1
    print(ans, recur)