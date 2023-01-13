sp, ss = map(int, input().split())
for i in range(sp):
    a, m = map(int, input().split())
    if a != m:
        print('Wrong Answer')
        exit(0)
for i in range(ss):
    a, m = map(int, input().split())
    if a != m:
        print('Why Wrong!!!')
        exit(0)
print('Accepted')