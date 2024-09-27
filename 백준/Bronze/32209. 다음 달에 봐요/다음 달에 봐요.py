q = int(input())
cnt = 0
for _ in range(q):
    o, c = map(int, input().split())
    if o == 1:
        cnt += c
    elif c > cnt:
        print('Adios')
        break
    else:
        cnt -= c
else:
    print('See you next month')