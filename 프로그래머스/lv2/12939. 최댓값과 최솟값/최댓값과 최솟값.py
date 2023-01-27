def solution(s):
    arr = list(map(int, s.split()))
    arr.sort()
    return '{} {}'.format(arr[0], arr[-1])