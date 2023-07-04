n, m, k = map(int, input().split())
score = [0 for _ in range(n)]
for _ in range(m):
    temp = input().split()
    for i in range(n):
        idx = int(temp[2*i])-1
        s = float(temp[2*i+1])
        if score[idx] < s:
            score[idx] = s
print('%0.1f' %sum(sorted(score, reverse=True)[:k]))