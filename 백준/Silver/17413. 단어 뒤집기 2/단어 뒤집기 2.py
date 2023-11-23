def reverse_word(s):
    global ans
    ans += s[::-1]
    return ''

s = input().strip()
i, f, ans, temp = 0, 0, '', ''
while i < len(s):
    if s[i].isalpha() or s[i].isnumeric():
        temp += s[i]
    elif s[i] == ' ':
        temp = reverse_word(temp)
        ans += ' '
    elif s[i] == '<':
        if temp:
            temp = reverse_word(temp)
        f = 1
        while f:
            ans += s[i]
            if s[i] == '>':
                f = 0
                break
            i += 1
    i += 1

if temp:
    reverse_word(temp)
print(ans)