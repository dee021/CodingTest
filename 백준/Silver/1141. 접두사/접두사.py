n = int(input())
t = sorted(set([input() for _ in range(n)]), key=lambda x:len(x))
m = 0
for i, s in enumerate(t):
    for j in range(i+1, len(t)):
        if t[j].startswith(s):
            m += 1
            break
print(len(t)-m)