import sys
input = sys.stdin.readline
print = sys.stdout.write

s = input().strip()
answer = ""
for i in range(len(s)):
    answer += str(i)+"\n"
print(answer)