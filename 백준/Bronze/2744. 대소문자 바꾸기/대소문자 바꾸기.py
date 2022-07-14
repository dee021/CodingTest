string = input()
def change(c):
    if c <= 'Z':
        return c.lower()
    else:
        return c.upper()
print(''.join(list(map(change, string))))