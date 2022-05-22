a,b=input().split()
x='';y=''
for i in range(3):
    x+=a[2-i]
    y+=b[2-i]
print(max(int(x), int(y)))