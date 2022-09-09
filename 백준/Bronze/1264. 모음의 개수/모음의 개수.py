import sys
def findChars(string):
    def find(char):
        return string.count(char)
    char = list(map(find, ['a', 'e', 'i', 'o', 'u']))
    return sum(char)

for line in sys.stdin:
    if line[0] == '#':
        break
    line = line.lower()
    print(findChars(line))