s = input(); l = len(s)-1

for i in range((l+1)//2):
    if s[i] != s[l-i]:
        print('false')
        break
else:
    print('true')