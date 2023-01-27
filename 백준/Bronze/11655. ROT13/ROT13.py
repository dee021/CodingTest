for c in input():
    if c.isalpha():
        r = ord(c)+13
        if c.islower() and r > 122:
            r -= 26
        elif c.isupper() and r > 90:
            r -= 26
        print(chr(r), end='')
    else:
        print(c, end='')