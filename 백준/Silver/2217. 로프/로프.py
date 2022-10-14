import sys
input = sys.stdin.readline

ans = 0
k = int(input())
lope = sorted([int(input()) for _ in range(k)])

for i in range(len(lope)):
    ans = max(ans, lope[i]*k)
    k -= 1
print(ans)

# 가능한 최대 중량을 구하기 위해
# 각 로프가 버틸 수 있는 최대 중량이 작은 순서로 버림