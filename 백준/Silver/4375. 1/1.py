import sys
input = sys.stdin.readline

while True:
    try:
        n = int(input())
    except:
        break
    ans = len(str(n))
    a = '1'*ans
    while True:
        if not int(a)%n:
            print(ans)
            break
        ans += 1
        a += '1'