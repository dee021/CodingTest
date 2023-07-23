n = int(input())
a, b = int(input(),2), input()
if n%2:
    b = int('1'*len(b), 2) ^ int(b, 2)
else:
    b = int(b, 2)
print(a^b == 0 and 'Deletion succeeded' or 'Deletion failed')