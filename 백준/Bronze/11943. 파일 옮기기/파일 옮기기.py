b1 = list(map(int, input().split()))
b2 = list(map(int, input().split()))
print(min(b1[0]+b2[1], b1[1]+b2[0]))