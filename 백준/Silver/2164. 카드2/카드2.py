from collections import deque

n = int(input())

card = deque([x for x in range(1,n+1)])

def lastCard(num):
    for i in range(num -1):
        card.popleft()
        card.append(card.popleft())
    return card[0]

print(lastCard(n))