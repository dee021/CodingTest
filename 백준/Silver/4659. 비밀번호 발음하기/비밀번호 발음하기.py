import sys
input = sys.stdin.readline

vowels = 'aeiou'
pattern = '<{}> is {}.'
output = ['not acceptable','acceptable']
while True:
    pw = input().strip()
    if pw == 'end':
        break
    ans = int(pw[0] in vowels)
    flag, letter, cnt = ans, pw[0], 1
    for c in pw[1:]:
        if letter == c and c not in 'eo':
            ans = 0
            break
        elif not (flag ^ (c in vowels)):
            cnt += 1
            if cnt >= 3:
                ans = 0
                break
        elif flag ^ (c in vowels):
            letter = c
            cnt = 1
            flag ^= 1
        if c in vowels:
            ans = 1
    print(pattern.format(pw, output[ans]))