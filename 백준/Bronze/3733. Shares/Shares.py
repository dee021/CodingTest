while True:
    try:
        n, s = map(int, input().split())
    except:
        break
    print(s//(n+1))