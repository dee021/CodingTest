v = 0
input()
for p in list(map(int, input().split())):
    v = 100 - (100-v)*(100-p)/100
    print(v)