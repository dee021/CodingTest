def solution(friends, gifts):
    l = len(friends)
    name = {friends[x]:x for x in range(l)}
    graph = [[0 for _ in range(l)] for _ in range(l)]
    score = [0 for _ in range(l)]
    for i in range(len(gifts)):
        a, b = gifts[i].split()
        graph[name[a]][name[b]] += 1
        score[name[a]] += 1
        score[name[b]] -= 1

    answer = [0 for _ in range(l)]
    for r in range(l):
        for c in range(r+1, l):
            a, b = graph[r][c], graph[c][r]
            if a == b:
                if score[r] > score[c]:
                    answer[r] += 1
                elif score[r] < score[c]:
                    answer[c] += 1
            elif a > b:
                answer[r] += 1
            else:
                answer[c] += 1

    return max(answer)