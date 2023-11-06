ans = ''
n = int(input())
while n and n != 1:
    ans += '1' if n%2 else '0'
    n = -(-n//-2)
ans += str(n)
print(ans[::-1])