b = list(map(int, input().split()))
d = list(map(int, input().split()))
j = list(map(int, input().split()))

b = max(abs(j[0]-b[0]), abs(j[1]-b[1]))
d = sum([abs(j[0]-d[0]), abs(j[1]-d[1])])

print(b < d and 'bessie' or 'daisy') if b != d else print('tie')