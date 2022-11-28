def solution(my_str, n):
    return [''.join([c for c in my_str[idx:idx+n]]) for idx in range(0, len(my_str), n)]