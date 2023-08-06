from itertools import starmap

sol = lambda x, q:ans[x][q]
ans = {'C':{chr(x):str(x-ord('A')+1) for x in range(ord('A'), ord('Z')+1)}}
ans['N'] = {v:k for k, v in ans['C'].items()}
for _ in range(int(input())):
    m, t = input().split()
    print(*(starmap(sol, [list(x) for x in zip(*[[t for _ in range(int(m))],input().split()])])))