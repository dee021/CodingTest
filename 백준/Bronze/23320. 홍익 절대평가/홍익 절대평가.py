n = int(input())
s = list(map(int, input().split()))
x, y = map(int, input().split())

print(int(n*x/100), len(list(filter(lambda s: s >= y, s))))