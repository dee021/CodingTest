def solution(a, b, c, d):
    arr = [a, b, c, d]
    arr = sorted(arr, key=lambda x: (-arr.count(x), x))
    l = len(set(arr))
    if l == 1:
        return 1111*a
    elif l == 4:
        return min(arr)
    elif l == 3:
        return arr[2]*arr[3]
    else:
        if arr[1] == arr[2]:
            return (10*arr[1]+arr[-1])**2
        else:
            return (arr[1]+arr[2])*abs(arr[1]-arr[2])