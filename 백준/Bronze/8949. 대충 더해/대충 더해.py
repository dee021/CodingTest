ans = ''
a, b = input().split()
if len(a) > len(b):
    b = (len(a)-len(b)) * '0' + b
elif len(a) < len(b):
    a = (len(b)-len(a)) * '0' + a

for i in range(len(a)):
    ans += str(int(a[i])+int(b[i]))
print(ans)