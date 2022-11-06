score = 0
ans=0
for i in range(5):
    iScore = sum(map(int, input().split()))
    if score < iScore:
        score = iScore
        ans = i + 1
print(ans, score)