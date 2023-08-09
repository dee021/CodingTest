def solution(brown, yellow):
    s = brown + yellow
    arr = [[h, s//h] for h in range(3,brown//2+1) if s//h == s/h]
    for h, w in arr:
        if (h-2)*(w-2) == yellow:
            return sorted([w, h], reverse=True)