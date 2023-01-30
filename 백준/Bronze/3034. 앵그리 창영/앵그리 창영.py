n, w, h = map(int, input().split())
s = (w**2 + h**2)**0.5
for i in range(n):
    if int(input()) <= s:
        print('DA')
    else:
        print('NE')