tmp = 0
n = int(input())
for i in range(n):
    if int(input().split('-')[1]) > 90:
        tmp += 1
print(n-tmp)