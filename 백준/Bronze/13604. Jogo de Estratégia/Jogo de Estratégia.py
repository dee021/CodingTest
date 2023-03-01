j, r = map(int, input().split())
lst = list(map(int, input().split()))
score = [0 for _ in range(j)]
for x in range(j):
    for y in range(r):
        score[j-x-1] += lst[y*j+x]
print(j-score.index(max(score)))