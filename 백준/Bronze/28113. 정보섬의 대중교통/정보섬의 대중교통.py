n, a, b = map(int, input().split())
f = True if n <= b else False
print('Anything' if f and a==b else 'Subway' if f and b<a else 'Bus')