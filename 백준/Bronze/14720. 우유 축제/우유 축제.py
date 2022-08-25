flag = 0; cnt = 0
n = int(input())
for i in list(map(int, input().split())):
    if i == flag:
        flag += 1
        flag %= 3
        cnt += 1
print(cnt)