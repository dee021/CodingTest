import sys

before = ''.join([chr(x) for x in range(ord('A'), ord('Z')+1)])
after = '10101111111111100010110001'
table = str.maketrans(before, after)
print(sum(map(int, sys.stdin.readline().strip().translate(table)))%2 and "I'm a winner!" or "You're the winner?")
