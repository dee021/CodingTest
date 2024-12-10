n = int(input())
score = [[x]+list(map(int, input().split())) for x in range(1, n+1)]
score.sort(key=lambda x:(-x[1], x[2], x[3]))
print(score[0][0])