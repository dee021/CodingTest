num = list(input())

cnt = 0
while cnt != (len(num)-1):
    cnt = 0
    for i in range(len(num)-1):
        if int(num[i]) < int(num[i+1]):
            temp = num[i+1]
            num[i+1] = num[i]
            num[i] = temp
        else:
            cnt += 1
print(''.join(num))