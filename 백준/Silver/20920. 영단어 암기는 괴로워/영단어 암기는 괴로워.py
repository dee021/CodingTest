import sys
input = sys.stdin.readline

n, m = map(int, input().split())
word = {}

for _ in range(n):
    w = input().strip()
    if w in word or len(w) >= m:
        word[w] = word.setdefault(w, 0) +1 

print('\n'.join(sorted([x for x in word.keys()], key= lambda x:(-word[x], -len(x), x))))