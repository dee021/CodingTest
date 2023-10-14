import bisect

def thanks(cnt):
    gift = gifts.pop()
    if cnt <= gift:
        gift -= cnt
        if gift:
            gifts.insert(bisect.bisect_left(gifts, gift), gift)
        return True
    return False

n, m = map(int, input().split())
gifts = sorted(map(int, input().split()))
kids = list(map(int, input().split()))

for k in kids:
    res = thanks(k)
    if not res:
        print(0)
        break
else:
    print(1)