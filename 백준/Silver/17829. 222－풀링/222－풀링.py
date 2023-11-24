import sys
input = sys.stdin.readline

def sol(l, lst):
    if l == 2:
        res = [*lst[0], *lst[1]]
        return sorted(res)[2]
    
    res = [[] for _ in range(l//2)]
    for i in range(0, l, 2):
        for j in range(0, l, 2):
            temp = [*lst[i][j:j+2]] + [*lst[i+1][j:j+2]]
            res[i//2].append(sorted(temp)[2])
    return sol(l//2, res)

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
print(sol(n, arr))