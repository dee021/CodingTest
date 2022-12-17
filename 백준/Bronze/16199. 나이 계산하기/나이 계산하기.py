birth = list(map(int, input().split()))
base = list(map(int, input().split()))

age = base[0] - birth[0]
if base[1] - birth[1] < 0:
    man = age - 1
elif base[2] - birth[2] < 0 and base[1] - birth[1] < 1:
    man = age - 1
else:
    man = age
print(man, age+1, age, sep = '\n')