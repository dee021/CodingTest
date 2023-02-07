n = int(input())
d = bool(int(input()))

if n//6:
    print('Love is open door')
else:
    print(*[int(not d) if i%2 else int(d) for i in range(1, n)], sep='\n')