n = int(input())
s = set(map(lambda x: x[0], input().split()))
print(len(s) == 1 and 1 or 0)