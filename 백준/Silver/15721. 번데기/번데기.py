a = int(input())
t = int(input())
w = int(input())
x, n = 0, 0
rnd = lambda x: 2*x + (x+1)*(x+2)//2 -1
while rnd(x + 1) < t:
    x += 1
t -= rnd(x)
p = (2*rnd(x))%a

while n < t:
    if n == 0:
        n+=1
        continue
    p += 2 if n <= 2 else 1
    p %= a
    n += 1

print((p+(x+1 if w and t > 2 else 0)+(1 if w else 0))%a)