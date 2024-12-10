import sys
input = sys.stdin.readline
print = sys.stdout.write

conv = {chr(ord('A')+x):x+1 for x in range(26)}
conv[' '] = 0
answer = ''
while True:
    s = input().strip()
    if s == '#':
        break
    chkSum = 0
    for i in range(len(s)):
        chkSum += (i+1)*conv[s[i]]
    answer += str(chkSum) + '\n'
print(answer)