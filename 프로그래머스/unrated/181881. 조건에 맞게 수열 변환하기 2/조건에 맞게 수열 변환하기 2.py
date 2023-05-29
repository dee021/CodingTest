def solution(arr):
    x = 0
    while True:
        flag = 1
        for i in range(len(arr)):
            if arr[i] >= 50 and arr[i]%2 == 0:
                arr[i] //= 2
                flag = 0
            elif arr[i] < 50 and arr[i]%2:
                arr[i] = arr[i]*2 + 1
                flag = 0
        if flag:
            return x
        x += 1