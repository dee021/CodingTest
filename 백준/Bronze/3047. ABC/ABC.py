arr = sorted(map(int, input().split()))
print(*[arr[ord(x)-65] for x in input()])