import sys
input = sys.stdin.readline

for _ in range(int(input())):
    recur = 0; ans = 1
    s = input().strip()
    if s == s[::-1]:
        recur = len(s)//2 + 1
    else:
        for i in range(len(s)):
            recur += 1
            if s[i] != s[-1*i -1]:
                ans = 0
                break
    print(ans, recur)