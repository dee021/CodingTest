import sys
input = sys.stdin.readline

score = []
for _ in range(int(input())):
    n, k, e, m = input().split()
    score.append([n, *map(int, [k, e, m])])
score.sort(key=lambda x:(-x[1], x[2], -x[3], x[0]))
print('\n'.join([list(x) for x in zip(*score)][0]))