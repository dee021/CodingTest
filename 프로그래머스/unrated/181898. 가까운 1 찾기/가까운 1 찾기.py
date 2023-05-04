def solution(arr, idx):
    return idx + arr[idx:].index(1) if 1 in arr[idx:] else -1