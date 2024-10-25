def solution(N, road, K):
    answer = 0
    path = {x:[] for x in range(1, N+1)}
    for a, b, d in road:
        path[a].append([b, d])
        path[b].append([a, d])
    distance = [float('inf') for _ in range(N+1)]
    distance[1] = 0
    
    stack = [[1, 0]]
    while stack:
        node, dis = stack.pop()
        for post, w in path[node]:
            if distance[post] > dis + w:
                distance[post] = dis + w
                stack.append([post, dis + w])
                
    for i in range(1, N+1):
        if distance[i] <= K:
            answer += 1
    
    return answer