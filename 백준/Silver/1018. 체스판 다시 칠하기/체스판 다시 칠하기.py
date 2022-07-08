import sys
from collections import deque
h, w = map(int, input().split())

# 가능한 패턴
ptn1 = 'WB' * 4
ptn2 = 'BW' * 4

# 칠해야 할 칸의 수를 표시
cnt1 = deque([0 for _ in range((w-7)*(h-7))])
cnt2 = deque([0 for _ in range((w-7)*(h-7))])
# i행 j열에서 시작하는 체스판의 index n = i*(w-7) + j

for i in range(h):
    color = input()
    if (i%2):
        str1 = ptn1; str2 = ptn2
    else:
        str1 = ptn2; str2 = ptn1
    for j in range(h-7):
        for x in range(w-7):
            diff1 = 0
            diff2 = 0
            for y in range(8):
                if color[x+y] != str1[y]:
                    diff1 += 1
                if color[x+y] != str2[y]:
                    diff2 += 1
            if i in range(j,j+8):
                cnt1[(w-7)*j+x] += diff1
                cnt2[(w-7)*j+x] += diff2

print(min(min(cnt1), min(cnt2)))