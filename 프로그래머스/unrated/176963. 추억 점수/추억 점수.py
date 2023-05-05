def solution(name, yearning, photo):
    s = {name[i]:yearning[i] for i in range(len(name))}
    answer = [sum(map(lambda x: s[x] if x in s else 0, p)) for p in photo]
    return answer