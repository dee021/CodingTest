import sys
input = sys.stdin.readline

n = int(input())
evens, odds = 0, 0 # 짝수와 홀수를 우선하여 왼쪽으로 정렬할 때의 시행 횟수
e, o = 0, 0 # 짝수와 홀수 개수

for idx, num in enumerate(map(int, input().split())):
    if num % 2:
        odds += idx - o
        o += 1
    else:
        evens += idx - e
        e += 1
print(min(evens, odds))