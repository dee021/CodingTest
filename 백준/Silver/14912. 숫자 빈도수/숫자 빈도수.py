n, num = input().split()
print(sum([str(x).count(num) for x in range(1, int(n)+1)]))