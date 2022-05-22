a = []
for i in range(9):
    a.insert(i,int(input()))
print(max(a), a.index(max(a))+1, sep='\n')