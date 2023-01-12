a, b, c, d, e, f = map(int, input().split())
y = (a*f-c*d)/(a*e-d*b)
x = (f-e*y)/d
print(int(x), int(y))    

# ax + by = c <=> dx + bdy/a = cd/a
# dx + ey = f

# (e - bd/a)y = f-cd/a
# y = (f - (cd/a))/(e - (bd/a)) = (af-cd/a)/(ae-db/a)
#   = (af-cd)a/(ae-db)a