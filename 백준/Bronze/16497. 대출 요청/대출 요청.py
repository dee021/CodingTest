days = [0 for _ in range(32)]
for _ in range(int(input())):
    for d in range(*map(int, input().split())):
        days[d] += 1
book = int(input())
print(1 if max(days) <= book else 0)