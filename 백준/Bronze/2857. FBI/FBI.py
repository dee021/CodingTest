fbi = []
for i in range(5):
    if input().count('FBI'):
        fbi.append(i+1)
print(*fbi) if fbi else print('HE GOT AWAY!')