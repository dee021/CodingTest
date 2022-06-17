import sys
n, m = map(int, sys.stdin.readline().split())
card = list(map(int, sys.stdin.readline().split()))

card.sort(reverse=1)
m1 = card[-1]; m2 = card[-2]
limit = m-m1-m2
card = [x for x in card if x <= limit]
choice=[]

for i in range(n):
    for j in range(i):
        for k in range(j):
            if card[i]+card[j]+card[k] <= m:
                if card[i]+card[j]+card[k] > sum(choice):
                    choice = [card[i],card[j],card[k]]
            if sum(choice) == m:
                break
        if sum(choice) == m:
                break
    if sum(choice) == m:
                break

print(sum(choice))
