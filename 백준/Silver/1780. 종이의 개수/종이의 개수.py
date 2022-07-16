import sys
n = int(input())

cnt = {-1:0, 0:0, 1:0}
paper = []

for i in range(n):
    paper.extend(list(map(int, sys.stdin.readline().split())))

def sol(lst):
    leng = int(len(lst)**0.5)
    goal = leng//3
    def divide():
        rt = []
        for r in range(0, leng, goal):
            for c in range(0, leng, goal):
                temp = []
                for x in range(goal):
                    temp.extend(lst[r*leng+(leng*x)+c:r*leng+(leng*x)+c+goal])
                rt.extend([temp])
        return rt
    if sum(lst) == len(lst):
        cnt[1] += 1
        return 
    elif sum(lst) == -1*len(lst):
        cnt[-1] += 1
        return
    elif all(0 == x for x in lst):
        cnt[0] += 1
        return
    else:
        lst= list(map(sol,divide()))
        return

sol(paper)
print(cnt[-1], cnt[0], cnt[1], sep = '\n')