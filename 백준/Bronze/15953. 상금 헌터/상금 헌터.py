import sys
input = sys.stdin.readline

ar = [0, 500, 300, 200, 50, 30, 10]
br = [512, 256, 128, 64, 32]

for _ in range(int(input())):
    ans = 0
    idx = 0
    a, b = map(int, input().split())
    if a <= 21 and a:
        for i in range(len(ar)):
            idx += i
            if a <= idx:
                ans += ar[i]
                break
    idx = 0
    if b <= 31 and b:
        for i in range(len(br)):
            idx += 2**i
            if b <= idx:
                ans += br[i]
                break
    print(ans*10000)