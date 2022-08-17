from collections import deque

card = deque([x for x in range(1, int(input())+1)])

for i in range(len(card)-1):
    print(card.popleft(), end = ' ')
    card.append(card.popleft())
print(card[0])