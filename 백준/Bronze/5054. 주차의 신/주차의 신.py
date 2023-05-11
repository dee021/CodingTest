for _ in range(int(input())):
    n = int(input())
    x = list(map(int, input().split()))
    avg = sum(x)/n
    print(sum([abs(int(avg)-min(x)), abs(int(avg)-max(x))])*2)