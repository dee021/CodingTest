a, b = map(int, input().split())
chic = int(input()) * 2
print((a+b)-chic if (a+b) >= chic else a+b)