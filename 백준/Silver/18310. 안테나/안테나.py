n = int(input())
h = sorted(map(int, input().split()))
print(n%2 and h[n//2] or h[n//2-1])