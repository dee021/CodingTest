pc = [0 for _ in range(101)]
ans = 0
input()
for p in map(int, input().split()):
    if pc[p]:
        ans += 1
    else:
        pc[p] += 1
print(ans)