while True:
    try:
        s = input()
    except:
        break
    arr = [0,0,0,0]
    for c in s:
        if c.islower():
            arr[0] += 1
        elif c.isupper():
            arr[1] += 1
        elif c.isnumeric():
            arr[2] += 1
        else:
            arr[3] += 1
    print(*arr)