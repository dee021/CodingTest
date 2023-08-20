n, m = map(int, input().split())
a = [input() for _ in range(n)]
b = [input() for _ in range(n)]
for i in range(n):
    if ''.join([x*2 for x in a[i]]) != b[i]:
        print('Not Eyfa')
        break
else:
    print('Eyfa')