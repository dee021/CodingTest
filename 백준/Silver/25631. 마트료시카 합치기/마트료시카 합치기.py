from collections import Counter

n = int(input())
cnt = Counter(map(int, input().split()))
print(max(cnt.values()))