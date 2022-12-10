s = [(1, 0)]
for i in range(int(input())):
    s.append((s[i][1], sum(s[i])))
    
print(*s[-1])