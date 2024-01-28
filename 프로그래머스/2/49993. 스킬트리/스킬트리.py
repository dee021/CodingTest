def solution(skill, skill_trees):
    answer = 0
    
    for st in skill_trees:
        idx, flag = 0, 1
        for s in st:
            if s in skill:
                if skill[idx] != s:
                    flag = 0
                    break
                idx += 1
        if flag:
            answer += 1

    return answer