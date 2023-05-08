def solution(rank, attendance):
    arr = [rank.index(x) for x in range(1,len(rank)+1) if attendance[rank.index(x)]]
    return 10000*arr[0] + 100*arr[1] + arr[2]