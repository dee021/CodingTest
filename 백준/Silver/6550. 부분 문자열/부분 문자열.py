import sys
input = sys.stdin.readline

while True:
    try:
        s, t = input().split()
    except:
        break
    sub, idx, l = '', 0, len(s)
    
    for c in t:
        if c == s[idx]:
            sub += c
            idx += 1
        if idx >= l:
            break
    print(sub == s and 'Yes' or 'No')