for t in range(1, int(input())+1):
    gap = 0
    n, *arr = list(map(int, input().split()))
    arr.sort()
    for i in range(n-1):
        if arr[i+1] - arr[i] > gap:
            gap = arr[i+1]-arr[i]
    print('Class {}\nMax {}, Min {}, Largest gap {}'.format(t, arr[-1], arr[0], gap))