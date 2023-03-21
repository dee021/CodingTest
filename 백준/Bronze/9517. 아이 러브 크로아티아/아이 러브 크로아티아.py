t = 3*60+30
i = int(input())
for q in range(int(input())):
    s, a = input().split()
    t -= int(s)
    if t <= 0:
        print(i)
        break
    if a == 'T':
        i += 1
    if i == 9:
        i = 1