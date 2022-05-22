n=int(input())
for i in range(n):
    m,s = input().split()
    text=''
    for j in range(len(s)):
        text+=s[j]*int(m)
    print(text)