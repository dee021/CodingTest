sum = lambda x : (x+1)*x//2
a, b = map(int, input().split())
a, b = min(a, b), max(a, b)
print(sum(b) - sum(a-1))