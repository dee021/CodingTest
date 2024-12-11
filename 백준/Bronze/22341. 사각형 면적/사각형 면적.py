import sys
input = sys.stdin.readline

n, c = map(int, input().split())
width, height = n, n

for _ in range(c):
    x, y = map(int, input().split())
    if x >= height or y >= width:
        continue
    if x*width >= y*height:
        height = x
    else:
        width = y
print(height*width)