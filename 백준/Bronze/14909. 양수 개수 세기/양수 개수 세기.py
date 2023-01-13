import sys
input = sys.stdin.readline

arr = [x for x in map(int, input().split()) if x > 0]
print(len(arr))