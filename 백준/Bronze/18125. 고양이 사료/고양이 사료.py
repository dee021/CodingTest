import sys
input = sys.stdin.readline

n, m = map(int, input().split())
picture = [input().strip().split() for _ in range(m)]
feed = [input().strip().split()[::-1] for _ in range(n)]
feed = [list(x) for x in zip(*feed)]

if picture == feed:
    print('|>___/|        /}\n| O < |       / }\n(==0==)------/ }\n| ^  _____    |\n|_|_/     ||__|')
else:
    print('|>___/|     /}\n| O O |    / }\n( =0= )""""  \\\n| ^  ____    |\n|_|_/    ||__|')