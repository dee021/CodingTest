ans = 0
x = input()

while int(x) >= 10:
    ans += 1
    tmp = 0
    for n in x:
        tmp += int(n)
    x = str(tmp)
print(ans, int(x) in [3,6,9] and 'YES' or 'NO', sep='\n')