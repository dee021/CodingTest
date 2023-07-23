s = input()
sub = input()
t = ''
for c in s:
    if c.isalpha():
        t += c
print(t.count(sub) and 1 or 0)