a, b, c, n = map(int, input().split())
for x in range(n//c +1, -1, -1):
    for y in range(n//b+1):
        for z in range(n//a+1):
            if x*c + y*b + z*a == n:
                print(1)
                exit(0)
            if x*c + y*b + z*a > n:
                break
        if x*c + y*b + z*a > n:
                break
print(0)