ap = [x*int(input()) for x in range(3, 0, -1)]
bn = [x*int(input()) for x in range(3, 0, -1)]
ap, bn = map(sum, [ap, bn])
print(ap > bn and 'A' or 'B') if ap != bn else print('T')