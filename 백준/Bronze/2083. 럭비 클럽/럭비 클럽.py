import sys

for line in sys.stdin:
    name, age, wei = line.split()
    if name == '#':
        break
    if age > '17':
        print(name, 'Senior')
        continue
    if wei >= '80':
        print(name, 'Senior')
        continue
    print(name, 'Junior')