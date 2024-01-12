import sys
input = sys.stdin.readline

n = int(input())
cnt = {}
gene = set()
ans = set()

for value in input().strip().split():
    cnt[value] = cnt.setdefault(value, 0) +1
    gene.add(value)

gene = sorted(gene)
for i in range(len(gene)):
    if cnt[gene[i]] > 1:
        ans.add(max(*gene[i]))
    for j in range(i+1, len(gene)):
        ans.add(max(gene[i][0], gene[j][1]))
        ans.add(max(gene[i][1], gene[j][0]))
print(len(ans))
print(*sorted(ans))