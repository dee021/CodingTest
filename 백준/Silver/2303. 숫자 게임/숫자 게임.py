import sys
input = sys.stdin.readline

def findBigNum(idx = 0, cnt = 0, res = 0):
    global person, num
    if cnt == 3:
        if num <= res:
            person = p
            num = res
        return
    
    if idx >= 5:
        return
    
    findBigNum(idx+1, cnt, res)
    findBigNum(idx+1, cnt +1, (res + card[idx])%10)


n = int(input())
person, num = 0,0
for p in range(1,n+1):
    card = list(map(int, input().split()))
    findBigNum()
print(person)