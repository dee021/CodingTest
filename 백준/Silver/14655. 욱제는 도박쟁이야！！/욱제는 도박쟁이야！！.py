n = int(input())
s1 = 0
for k in map(int, input().split()):
    s1 += abs(k)

s2 = 0
for k in map(int, input().split()):
    s2 -= abs(k)
    
print(s1 - s2)