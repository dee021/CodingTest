import sys
input = sys.stdin.readline

n = int(input())
arr = [set() for _ in range(6)]
for _ in range(n):
    x, y = map(int, input().split())
    if x == 0:
        arr[0].add(y/abs(y))
    elif y == 0:
        arr[5].add(x/abs(x))
    elif x > 0 and y > 0:
        arr[1].add(y/x)
    elif x < 0 and y > 0:
        arr[2].add(y/x)
    elif x < 0 and y < 0:
        arr[3].add(y/x)
    else:
        arr[4].add(y/x)

print(sum([len(arr[i]) for i in range(6)]))