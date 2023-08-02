def sol(s, l):
    for i in range((l+1)//2):
        if s[i] != s[l-i]:
            print('No')
            break
    else:
        print('Yes')

for _ in range(int(input())):
    s = input().lower()
    sol(s, len(s)-1)