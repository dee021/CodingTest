s = input()
for c in input().split():
    s = s.replace(c, chr(ord(c)+32))
print(s)