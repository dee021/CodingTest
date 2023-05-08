def solution(arr):
    l = bin(len(arr))[2:]
    if l.rstrip('0') == '1':
        return arr
    arr.extend([0]*(2**len(l)-len(arr)))
    return arr