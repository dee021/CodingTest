import sys
input = sys.stdin.readline

def isMatch(idx = 0):
    if idx == len(s)-1:
        visited[idx] = 1
        return
    
    # 기탐색지점 종료
    if visited[idx]:
        return
    
    visited[idx] = 1
    flag = 0
    for l in range(len(s)-idx-1, 0, -1):
        for w in words[s[idx+1]][l]:
            if s[idx+1:].startswith(w):
                flag = 1
                isMatch(idx+len(w))
                if visited[-1] == 1:
                    return
    
    if not flag:
        visited[idx] = -1
    

s = ' ' + input().strip()
visited = [0 for _ in range(len(s))]
words = {chr(x):[[] for _ in range(101)] for x in range(ord('a'), ord('z')+1)}
for _ in range(int(input())):
    w = input().strip()
    words[w[0]][len(w)].append(w)

isMatch()
print(visited[-1] == 1 and 1 or 0)