ans = [x*(x+1)*(2*x+1)//6 for x in range(1, 101)]

while True:
    n = int(input())
    if not n:
        break
    print(ans[n-1])