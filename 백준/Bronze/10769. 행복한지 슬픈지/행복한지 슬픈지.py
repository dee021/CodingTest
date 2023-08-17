h, s = map(input().count, [':-)', ':-('])
if h == s:
    print(h and 'unsure' or 'none')
else:
    print(h > s and 'happy' or 'sad')