from collections import Counter

def sol(s):
    s = Counter(s)
    p, m = 0,0
    for o in range(ord('A'), ord('Z')+1):
        # print()
        c = chr(o)
        if word[c] != s[c]:
            if word[c] > s[c]:
                p += word[c] - s[c]
            else:
                m += s[c] - word[c]
        if p > 1 or m > 1:
            return 0
    return 1

n = int(input())
word = Counter(input().strip())
ans = 0
for _ in range(n-1):
    ans += sol(input().strip())
print(ans)