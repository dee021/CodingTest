import sys
input = sys.stdin.readline

game = {'Y':1, 'F':2, 'O':3}
name = set()
n, g = input().rstrip().split()
for _ in range(int(n)):
    name.add(input())
print(len(name)//game[g])