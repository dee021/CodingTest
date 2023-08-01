for _ in range(int(input())):
    s = input().lower().count
    if all(map(s, list(map(chr, range(ord('a'), ord('z')+1))))):
        print('pangram')
    else:
        apb = [s(chr(x+ord('a'))) for x in range(26)]
        print('missing {}'.format(''.join([chr(i+ord('a')) for i in range(26) if not apb[i]])))