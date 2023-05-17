x = 'EISNTFJP'
con = {x[i]:x[i-1] if i%2 else x[i+1] for i in range(len(x))}
print(*map(lambda c:con[c], input()), sep='')