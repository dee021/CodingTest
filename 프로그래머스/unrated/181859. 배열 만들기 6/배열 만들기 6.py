def solution(arr):
    i = 0
    stk = []
    while i < len(arr):
        if stk:
            if stk[-1] == arr[i]:
                stk.pop()
            else:
                stk.append(arr[i])
        else:
            stk.append(arr[i])
        i += 1
    return stk if stk else [-1]