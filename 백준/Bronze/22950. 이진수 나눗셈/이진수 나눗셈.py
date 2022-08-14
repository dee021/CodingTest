n = input()
m = int('0b' + input(),2)
k = 2**int(input())

print('NO') if m%k else print('YES')