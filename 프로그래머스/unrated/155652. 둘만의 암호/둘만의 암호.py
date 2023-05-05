def solution(s, skip, index):
    apb = [chr(c) for c in range(ord('a'), ord('z')+1) if chr(c) not in skip]*3
    answer = [apb[apb.index(c)+index] if c not in skip else c for c in s]
    return ''.join(answer)