def solution(id_list, report, k):
    d = dict().fromkeys(id_list, []) # k = 유저, v = 신고한 u
    report = set(report)
    tmp = [list(x) for x in zip(*[x.split() for x in report])][1]
    cnt = [tmp.count(x) for x in id_list] # 신고 건
    
    for r in report:
        id1, id2 = r.split()
        if cnt[id_list.index(id2)] >= k:
            if d[id1]:
                d[id1].append(id2)
            else:
                d[id1] = [id2]
    return [len(d[x]) for x in id_list]