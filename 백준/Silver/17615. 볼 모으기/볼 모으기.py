import sys
input = sys.stdin.readline

def sol(ball):
    global ans
    try:
        idx = ball.index('R' if ball[0] == 'B' else 'B')
        red, blue = 0,0
    except:
        ans = 0
        return 

    for b in ball[idx:]:
        if b == 'B':
            blue += 1
        else:
            red += 1
    ans = min(ans, blue, red)

n = int(input())
ball = input().strip()
ans = n
sol(ball)
sol(ball[::-1])
print(ans)