while True:
    s = input().count
    if s('*') == 1:
        break
    print(all(list(map(s, list(map(chr, range(ord('a'), ord('z')+1)))))) and 'Y' or 'N')