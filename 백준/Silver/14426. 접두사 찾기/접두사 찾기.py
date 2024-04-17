import sys
input = sys.stdin.readline

def addWord(word):
    temp = words
    for w in word:
        if w not in temp:
            temp[w] = {}
        temp = temp[w]
        
def checkWord(word):
    temp = words
    for w in word:
        if w not in temp:
            return False
        temp = temp[w]
    return True

n, m = map(int, input().split())
words = {}
ans = 0

for _ in range(n):
    addWord(input().strip())
for _ in range(m):
    ans += checkWord(input().strip())
print(ans)