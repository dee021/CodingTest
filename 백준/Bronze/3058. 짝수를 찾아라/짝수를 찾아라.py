import sys
input = sys.stdin.readline

for _ in range(int(input())):
    arr = [x for x in map(int, input().split()) if x%2 == 0]
    arr.sort()
    print(sum(arr), arr[0])