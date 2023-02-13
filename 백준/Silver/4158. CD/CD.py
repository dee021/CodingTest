import sys
input = sys.stdin.readline

while True:
    sang, sun = map(int, input().split())
    if sang == 0 == sun:
        break
    cd = set([int(input()) for _ in range(sang)])
    print(len(cd & set([int(input()) for _ in range(sun)])))