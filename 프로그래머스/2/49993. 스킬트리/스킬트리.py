def solution(skill, skill_trees):
    answer = 0
    
    for st in skill_trees:
        start, idx, flag = 0, 0, 1
        while flag and idx < len(skill) and start < len(st):
            for i, s in enumerate(st[start:], start):
                if s in skill:
                    if skill[idx] != s:
                        flag = 0
                        break
                    start = i + 1
                    idx += 1
                    break
                if i == len(st) -1:
                    start = i+1
        if flag:
            answer += 1

    return answer