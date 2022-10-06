from collections import Counter

n = Counter(input())
cnt = n['6'] + n['9']
n['6'] = n['9'] = 0
if cnt != cnt/2:
    cnt += 1
cnt //= 2
print(max(cnt, max(n.values())))