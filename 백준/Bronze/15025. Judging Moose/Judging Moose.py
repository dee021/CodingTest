l, r = map(int, input().split())
print('{} {}'.format(['Odd', 'Even'][l==r], max(l, r)*2)) if sum([l, r]) else print('Not a moose')