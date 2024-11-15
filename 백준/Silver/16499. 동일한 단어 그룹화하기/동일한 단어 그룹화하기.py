import sys
input = sys.stdin.readline

group = [[] for _ in range(101)]
ans = 0
for _ in range(int(input())):
    word = sorted(input().strip())
    for lst in group[len(word)]:
        if word == lst:
            break
    else:
        ans += 1
        group[len(word)].append(word)

print(ans)