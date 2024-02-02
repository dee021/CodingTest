from collections import deque

def solution(n, wires):
    def sol(k):
        group = set([k])
        q = deque([k])
        while q:
            k = q.popleft()
            for post in node[k]:
                if post and post not in group:
                    group.add(post)
                    q.append(post)
        return abs(n-2*len(group))
    
    answer = n
    node = {x:[] for x in range(1, n+1)}
    
    for a, b in wires:
        node[a].append(b)
        node[b].append(a)
        
    for a in range(1, n+1):
        for i in range(len(node[a])):
            b = node[a][i]
            node[a][i] = 0
            answer = min(answer, sol(a))
            node[a][i] = b
    
    return answer