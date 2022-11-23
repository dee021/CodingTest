def solution(box, n):
    return min(box[0], box[1])//n*(max(box[0], box[1])//n)*(box[2]//n)