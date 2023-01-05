import sys
input = sys.stdin.readline

def sol(c):
    if c == 'Z':
        return 'A'
    return chr(ord(c)+1)

for t in range(int(input())):
    name = list(map(sol, input().rstrip()))
    if t > 0:
        print()
    print('String #'+str(t+1))
    print(''.join(name))