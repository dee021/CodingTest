def solution(progresses, speeds):
    l = len(progresses)
    progresses = [(100-progresses[x])//speeds[x]+bool((100-progresses[x])%speeds[x]) for x in range(l)]
    answer = []
    maxd = 0
    for b in range(l):
        if maxd >= progresses[b]:
            continue
        maxd = progresses[b]
        t = 0
        for i in range(b,l):
            if progresses[i] > maxd:
                break
            t += 1
        answer.append(t)
    return answer