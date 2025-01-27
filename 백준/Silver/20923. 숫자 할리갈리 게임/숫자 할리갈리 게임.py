from collections import deque
import sys
input = sys.stdin.readline

def play(flag):
    global grd1, grd2
    if flag: # su
        grd2.append(card2.pop())
    else: # do
        grd1.append(card1.pop())
    if not card1 or not card2:
        return
    if grd1 and grd2 and grd1[-1] + grd2[-1] == 5:
        card2.extendleft(grd1)
        card2.extendleft(grd2)
        grd1, grd2 = deque(), deque()
    elif (grd1 and grd1[-1] == 5) or (grd2 and grd2[-1] == 5):
        card1.extendleft(grd2)
        card1.extendleft(grd1)
        grd1, grd2 = deque(), deque()
        


n, m = map(int, input().split())
card1, card2 = deque(), deque()
grd1, grd2 =  deque(), deque()

for _ in range(n):
    a, b = map(int, input().split())
    card1.append(a)
    card2.append(b)

for r in range(m):
    play(r%2)
    if not card1 or not card2:
        break

if len(card1) == len(card2):
    print('dosu')
else:
    print(len(card1) > len(card2) and 'do' or 'su')