import re
from collections import Counter

def solution(str1, str2):
    def makeSet(t, l):
        t = t.lower()
        s = []
        p = re.compile('[a-zA-Z]{2}')
        for i in range(l-1):
            try:
                s.append(p.match(t[i:i+2]).group())
            except:
                pass
        return s
    str1, str2 = makeSet(str1, len(str1)), makeSet(str2, len(str2))
    if not str1 and not str2:
        return 65536
    str1, str2 = map(Counter, [str1, str2])
    c, p = 0, 0
    for w in set(str1.keys()) | set(str2.keys()):
        c += min(str1[w], str2[w])
        p += max(str1[w], str2[w])
    return int(65536*c/p)