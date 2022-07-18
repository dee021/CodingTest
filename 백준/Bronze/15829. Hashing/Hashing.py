r = 31
m = 1234567891

n = int(input())
acc = [0 for _ in range(n)]
txt = list(input())

txt[0] = (ord(txt[0]) - 96)
acc[0] = txt[0]

for i in range(1,n):
    txt[i] = (ord(txt[i]) - 96) * r**i
    acc[i] = acc[i-1] + txt[i]

print(acc[n-1]%m)