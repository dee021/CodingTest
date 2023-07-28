ans = [(x-1)%5 + 1 for x in range(1, 11)]

for i in range(int(input())):
    if list(map(int, input().split())) == ans:
        print(i+1)