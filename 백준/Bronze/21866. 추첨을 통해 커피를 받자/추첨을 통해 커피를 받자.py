score = list(map(int, input().split()))
flag = False; ts = 0
s = [100,100,200,200,300,300,400,400,500]

for i in range(9):
    if score[i] > s[i]:
        flag = True
        break
    ts += score[i]

if flag:
    print('hacker')
else:
    print(ts >= 100 and 'draw' or 'none')