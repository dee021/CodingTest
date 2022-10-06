b = input().split('.')
for i in range(len(b)):
    if len(b[i])%2:
        print(-1)
        exit()
    while b[i].count('X'):
        b[i] = b[i].replace('XXXX', 'AAAA')
        if b[i].count('X') < 4:
            b[i] = b[i].replace('XX', 'BB')
print('.'.join(b))