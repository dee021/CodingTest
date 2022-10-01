ans = 0
for i in range(8):
    line = input()
    if i%2: # odd
        for j in range(1, 8, 2):
            ans += line[j]=='F'and 1 or 0
    else: # even
        for j in range(0, 8, 2):
            ans += line[j]=='F' and 1 or 0
print(ans)