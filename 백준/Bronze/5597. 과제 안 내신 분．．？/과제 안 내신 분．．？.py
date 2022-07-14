st = [1 for _ in range(30)]
for i in range(28):
    st[int(input())-1] = 0
print('\n'.join([str(x+1) for x in range(30) if st[x] == 1]))