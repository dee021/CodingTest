n = input()
line = []
for stu, num in enumerate(map(int, input().split())):
    if num == 0:
        line.append(stu+1)
    else:
        line.insert(len(line)-num, stu+1)
print(*line)