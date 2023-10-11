import sys
input = sys.stdin.readline

dance = set(['ChongChong'])
for _ in range(int(input())):
    a, b = input().strip().split()
    if any(x in dance for x in [a, b]):
        dance.update([a, b])
print(len(dance))