import heapq

def thanks(cnt):
    gift = -heapq.heappop(gifts)
    if cnt <= gift:
        gift -= cnt
        if gift:
            heapq.heappush(gifts, -gift)
        return True
    return False

n, m = map(int, input().split())
gifts = list(map(int.__neg__, map(int, input().split())))
heapq.heapify(gifts)
kids = list(map(int, input().split()))

for k in kids:
    res = thanks(k)
    if not res:
        print(0)
        break
else:
    print(1)