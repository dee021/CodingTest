import sys
input = sys.stdin.readline

w_set = set('Never gonna give you up\n\
Never gonna let you down\n\
Never gonna run around and desert you\n\
Never gonna make you cry\n\
Never gonna say goodbye\n\
Never gonna tell a lie and hurt you\n\
Never gonna stop'.strip().split('\n'))

ans = 'No'
for _ in range(int(input())):
    w = input().strip()
    if w not in w_set:
        ans = 'Yes'
        break
print(ans)