for c in input():
    e = ord(c)-3
    if e < 65:
        e += 26
    print(chr(e), end='')