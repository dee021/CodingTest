n = int(input())
s = input().strip()
sigma = (n-1)*(n)//2
temp = ''

for i in s:
    if i == ' ':
        sigma -= int(temp)
        temp = ''
    else:
        temp += i
print(abs(sigma - int(temp)))