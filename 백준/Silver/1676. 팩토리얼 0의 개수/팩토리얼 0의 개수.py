def count(num):
    n = 1
    cnt = 0
    while num >= (5**n):
        cnt += num//(5**n)
        n += 1
    return cnt

k = int(input())
print(count(k))