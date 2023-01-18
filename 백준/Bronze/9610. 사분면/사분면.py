ans = {'Q1':0, 'Q2':0, 'Q3': 0, 'Q4':0, 'AXIS':0}

for _ in range(int(input())):
    x, y = map(int, input().split())
    if x == 0 or y == 0:
        ans['AXIS'] += 1
    elif x > 0:
        if y > 0:
            ans['Q1'] += 1
        else:
            ans['Q4'] += 1
    else:
        if y > 0:
            ans['Q2'] += 1
        else:
            ans['Q3'] += 1
for k in ('Q1', 'Q2', 'Q3', 'Q4', 'AXIS'):
    print('{}: {}'.format(k, ans[k]))