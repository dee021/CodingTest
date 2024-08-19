import sys
input = sys.stdin.readline

n = int(input())
answer = {}
for i, ans in enumerate(input().strip().split()):
    answer[ans] = i
hw = input().strip().split()

total, score = n*(n-1)//2 , 0
for i in range(1, n):
    for j in range(i):
        if answer[hw[i]] - answer[hw[j]] > 0:
            score += 1
if n == 2:
    total *= 2
    score *= 2
print('{}/{}'.format(score, total))