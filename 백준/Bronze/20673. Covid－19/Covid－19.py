p, q = int(input()), int(input()) 
if p <= 50 and q <= 10:
    ans = 'White'
elif q > 30:
    ans = 'Red'
else:
    ans = 'Yellow'
print(ans)