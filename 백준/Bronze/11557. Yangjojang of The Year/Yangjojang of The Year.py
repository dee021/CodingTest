import sys
input = sys.stdin.readline

for _ in range(int(input())):
    lst = []
    for _ in range(int(input())):
        s, d = input().rstrip().split()
        lst.append([s, int(d)])
    print(sorted(lst, key=lambda x: x[1], reverse=True)[0][0])
