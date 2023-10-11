color = set(input().split())
color.update(set(input().split()))
color = sorted(color)
for c1 in color:
    for c2 in color:
        print(c1, c2)