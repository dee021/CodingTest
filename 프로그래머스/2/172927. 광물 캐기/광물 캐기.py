def dfs(picks, minerals):
    if not any(picks) or not minerals:
        return 0
    res = 10**6
    for p in range(3):
        if picks[p]:
            picks[p] -= 1
            cur = 0
            post = 10**6
            for i in range(min(5, len(minerals))):
                cur += d[minerals[i]][p]
            post = min(post, dfs(picks, minerals[5:].copy() if minerals[5:] else []))
            res = min(res, post + cur)
            picks[p] += 1
    return res
            


def solution(picks, minerals):
    answer = dfs(picks, minerals.copy())
    return answer

d = {"diamond":[1,5,25], "iron":[1,1,5], "stone":[1,1,1]}