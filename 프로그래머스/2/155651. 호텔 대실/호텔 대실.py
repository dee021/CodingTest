from heapq import heappush, heappop

conv = lambda x: int(x.split(':')[0])*60 + int(x.split(':')[1])


def solution(book_time):
    book_time.sort()
    room = []
    for i in range(len(book_time)):
        s, e = map(conv, book_time[i])
        if room and room[0] <= s:
            heappop(room)
        heappush(room, e + 10)
    return len(room)