from itertools import permutations

def solution(k, dungeons):
    answer = 0
    for pt in list(permutations(range(len(dungeons)), len(dungeons))):
        tmp, cnt = k, 0
        for i, p in enumerate(pt):
            if dungeons[p][0] <= tmp:
                cnt += 1
                tmp -= dungeons[p][1]
            else:
                break
        answer = max(answer, cnt)
    return answer