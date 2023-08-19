import sys
input = sys.stdin.readline
from collections import Counter

mbti = 'ISTJ, ISFJ, INFJ, INTJ, ISTP, ISFP, INFP, INTP, ESTP, ESFP, ENFP, ENTP, ESTJ, ESFJ, ENFJ, ENTJ'.split(', ')
dis = [[len([1 for x in range(4) if mbti[i][x] != mbti[j][x]]) for i in range(16)] for j in range(16)]
for _ in range(int(input())):
    n = int(input())
    pp = Counter(input().split())
    key = pp.keys()
    dif = [0]
    for i, x in enumerate(mbti):
        if x not in key:
            continue
        for j, y in enumerate(mbti[i:], start=i):
            if y not in key:
                continue
            for k, z in enumerate(mbti[j:], start=j):
                if z not in key:
                    continue
                l = len(set([i, j, k]))
                if l == 3:
                    dif.append(dis[i][j] + dis[j][k] + dis[i][k])
                elif l == 2 and any(2 <= x for x in [pp[x], pp[y], pp[z]]):
                    dif.append((dis[i][j] if pp[x] and pp[y] else 0) + (dis[j][k] if pp[y] and pp[z] else 0) + (dis[i][k] if pp[x] and pp[z] else 0))
                elif l == 1 and any(3 <= x for x in [pp[x], pp[y], pp[z]]):
                    dif.append(0)
    print(sorted(dif)[len(dif) > 1])