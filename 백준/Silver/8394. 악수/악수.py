n = int(input()) -1
t, f = 0, 1

for i in range(n):
    t, f = f%10, t+f%10
print((t+f)%10)