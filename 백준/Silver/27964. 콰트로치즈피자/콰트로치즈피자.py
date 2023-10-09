n = int(input())
cheese = set()
for t in input().split():
    if t.endswith('Cheese'):
        cheese.add(t)
        if len(cheese) == 4:
            print('yummy')
            break
else:
    print('sad')