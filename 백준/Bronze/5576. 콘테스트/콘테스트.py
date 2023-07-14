ans = []
for _ in range(2):
    arr = [int(input()) for _ in range(10)]
    ans.append(sum(sorted(arr, reverse=True)[:3]))
print(*ans)