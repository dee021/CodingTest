apb = [chr(x) for x in range(ord('a'), ord('z')+1)]

for _ in range(int(input())):
    a, b = input().split()
    print('{} & {} are {}anagrams.'.format(a, b, ['NOT ', ''][list(map(a.count, apb)) == list(map(b.count, apb))]))