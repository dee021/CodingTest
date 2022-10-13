import sys
input = sys.stdin.readline

def sol(num):
    global b, c
    ans = 1; num -= b
    if num > 0:
        ans += num//c
        num -= num//c * c
    if num > 0:
        ans += 1
    return ans

int(input())
a = list(map(int, input().split()))
b, c = map(int, input().split())

ans = sum(list(map(sol, a)))
print(ans)