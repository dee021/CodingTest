import sys

s = sys.stdin.readline().strip()
diff = set()

for i in range(len(s)):
    for j in range(len(s)):
        diff.add(s[j:j+i+1])
print(len(diff))