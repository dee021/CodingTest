n = int(input())
char = {chr(x):0 for x in range(ord('a'), ord('z')+1)}
string = input().strip()
ans = 0
for c in string:
    if c.isalnum():
        char[c] += 1
        ans = max(ans, char[c])
print(ans)