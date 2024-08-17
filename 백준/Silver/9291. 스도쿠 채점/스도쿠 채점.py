import sys
input = sys.stdin.readline

def check():
    for idx in range(9):
        if len(set(sdk[idx])) != 9:
            return False
        if len(set([sdk[x][idx] for x in range(9)])) != 9:
            return False
        
        if idx/3 == idx//3:
            for i in [0,3,6]:
                tmp = set(sdk[idx][i:i+3])
                tmp = tmp.union(sdk[idx+1][i:i+3])
                tmp = tmp.union(sdk[idx+2][i:i+3])
                if len(tmp) != 9:
                    return False
    return True

n = int(input())
for t in range(1, n+1):
    sdk = [list(map(int, input().split())) for _ in range(9)]
    ans = ['INCORRECT', 'CORRECT'][check()]
    print('Case {}: {}'.format(t, ans))
    if t != n:
        input()