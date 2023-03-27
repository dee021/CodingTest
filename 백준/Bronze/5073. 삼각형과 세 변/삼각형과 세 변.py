import sys
input = sys.stdin.readline

ans = ['Equilateral', 'Isosceles', 'Scalene']

def sol(a, b, c):
    if a+b <= c:
        return 'Invalid'
    return ans[len(set([a, b, c]))-1]

while True:
    t = sorted(map(int, input().split()))
    if not sum(t):
        break
    print(sol(*t))