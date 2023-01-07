ans = 0
x = list(input())

while len(x) >= 2:
    ans += 1
    tmp = sum(map(int, x))
    x = list(str(tmp))
print(ans, int(x.pop())%3 and 'NO' or 'YES', sep='\n')