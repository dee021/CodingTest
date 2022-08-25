ans = [0 for _ in range(4)]
ans[0], ans[1] = map(int, input().split())
ans[2], ans[3] = map(int, input().split())

# ex) 0번 회전 > 2번 회전
# (ad + bc)/cd > (ad + bc)/ab
# <=> cb < ab

ans = [ans[2]*ans[3], ans[3]*ans[1], ans[1]*ans[0], ans[0]*ans[2]]
print(ans.index(min(ans)))