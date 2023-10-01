res = lambda x:int(int(x) in arr1)

for _ in range(int(input())):
    n = int(input())
    arr1 = set(map(int, input().split()))
    m = int(input())
    ans = list(map(res, input().split()))
    print(*ans, sep='\n')