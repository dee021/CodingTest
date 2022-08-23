score = []
for _ in range(5):
    s = int(input())
    score.append(s if s>=40 else 40)
print(round(sum(score)/5))