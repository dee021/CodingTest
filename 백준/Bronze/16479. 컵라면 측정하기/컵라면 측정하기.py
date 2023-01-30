k = int(input())**2
d1, d2 = map(int, input().split())
ans = k-((d1-d2)/2)**2
if ans == int(ans):
    ans = int(ans)
print(ans)