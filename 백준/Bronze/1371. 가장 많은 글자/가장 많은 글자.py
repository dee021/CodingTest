import sys
from collections import Counter

cnt = Counter()
for line in sys.stdin:
    cnt += Counter(line.strip())
cnt[' '] = 0
print(*sorted([k for k in cnt.keys() if cnt[k] == max(cnt.values())]), sep='')