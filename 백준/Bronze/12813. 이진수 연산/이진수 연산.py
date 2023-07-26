a, b = int(input(), 2), int(input(), 2)
s = 100000
print(bin(a&b)[2:].zfill(s))
print(bin(a|b)[2:].zfill(s))
print(bin(a^b)[2:].zfill(s))
print(bin(a^int('1'*s,2))[2:].zfill(s))
print(bin(b^int('1'*s,2))[2:].zfill(s))