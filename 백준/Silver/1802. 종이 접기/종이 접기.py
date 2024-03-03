import sys
input = sys.stdin.readline

def sol(lst):
    while len(lst) > 1:
        tmp, lst = lst[0::2], lst[1::2]
        for i in range(len(tmp)-1):
            if tmp[i] == tmp[i+1]:
                return 0
    return 1

for _ in range(int(input())):
    paper = list(map(int, input().strip()))
    res = sol(paper)
    print(res and 'YES' or 'NO')