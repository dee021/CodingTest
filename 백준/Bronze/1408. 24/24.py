arr = [60*60, 60, 1]
ptime = sum(map(lambda x, y:x*y, map(int, input().split(':')), arr))
ans = sum(map(lambda x, y:x*y, map(int, input().split(':')), arr)) - ptime
if ans < 0:
    ans += 24*60*60
print('{:0>2}:{:0>2}:{:0>2}'.format(ans//3600, (ans%3600)//60, ans%3600%60))