import sys
input = sys.stdin.readline

word = input().strip()
ans = 0
for _ in range(int(input())):
    s = input().strip() * 2
    if s.count(word):
        ans += 1
print(ans)