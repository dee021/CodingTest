import sys
input = sys.stdin.readline
print = sys.stdout.write

before = ''.join([chr(x) for x in range(ord('A'), ord('Z')+1)])
for _ in range(int(input())):
    string = input().strip()
    after = input().strip()
    table = ''.maketrans(before, after)
    print(string.translate(table)+'\n')