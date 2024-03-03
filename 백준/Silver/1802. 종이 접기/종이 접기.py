import sys
input = sys.stdin.readline

def sol(lst):
    while len(lst) > 1:
        f = lst[-1]
        for i in range(len(lst)-1, -1, -2):
            if f != lst[i]:
                return 0
            f ^= 1
            del lst[i]
    return 1

for _ in range(int(input())):
    paper = list(map(int, input().strip()))
    res = sol(paper)
    print(res and 'YES' or 'NO')