a = input()
oper = []

for i in a:
    if i == '+' or i == '-':
        a = a.replace(i, ' ',1)
        oper.append(i)
num = list(map(int, a.split()))

for i in range(len(num)-1):
    if oper[i] == '+':
        num[i+1] += num[i]
        num[i] = 0

num = [x for x in num if x != 0]
oper = [x for x in oper if x != '+']
   
res = num[0]
for i in range(len(oper)):
    if oper[i] == '-':
        res -= num[i+1] if len(num) > i+1 else 0
    
print(res)