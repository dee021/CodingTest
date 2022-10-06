stick = 64
s = []
n = int(input())

while n < sum(s) + stick:
    if sum(s) + stick/2 <= n:
        s.append(stick//2)
    stick //= 2
print(stick and len(s)+1 or len(s))