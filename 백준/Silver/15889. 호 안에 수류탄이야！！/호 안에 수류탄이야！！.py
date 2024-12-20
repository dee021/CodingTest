import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    if n == 1:
        return '권병장님, 중대장님이 찾으십니다'
    dis = list(map(int, input().split()))
    cur = 0
    for i, p in enumerate(map(int, input().split())):
        if cur < dis[i]:
            break
        cur = max(cur, dis[i] + p)
    return dis[-1] <= cur and '권병장님, 중대장님이 찾으십니다' or '엄마 나 전역 늦어질 것 같아'

print(sol())