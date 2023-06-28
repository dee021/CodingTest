for _ in range(int(input())):
    n, *score = map(int, input().split())
    mean=sum(score)/n
    ans = len(list(filter(lambda x: x>mean, score)))/n*100
    print('%0.3f' %ans + '%')