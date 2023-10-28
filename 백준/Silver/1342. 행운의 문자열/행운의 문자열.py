from collections import Counter
import math

def sol(word):
    global ans
    if len(word) == l:
        ans += 1
        return
    
    for c in ch:
        if (not word or word[-1] != c) and cnt[c]:
            cnt[c] -= 1
            sol(word+c)
            cnt[c] += 1

s = input()
ch, l, ans = set(s), len(s), 0
cnt = Counter(s)
if not [x for x in ch if cnt[x] > 1]:
    print(math.factorial(l))
else:
    sol('')
    print(ans)