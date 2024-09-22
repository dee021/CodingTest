import sys
input = sys.stdin.readline

def findNum(k, key):
    if key:
        key = 'gs'
    else:
        key = 'sg'

    for c in card[key]:
        if c > k:
            card[key].remove(c)
            return c
    return 0

n = int(input())
card = {'sg':[]}
for _ in range(n):
    card['sg'].append(int(input()))
card['sg'].sort() 
card['gs'] = [x for x in range(1, 2*n+1) if x not in card['sg']]

k, key = 0, 0
while card['sg'] and card['gs']:
    res = findNum(k, key)
    if res:
        k = res
    else:
        k = 0
    key ^= 1
print(len(card['gs']), len(card['sg']), sep='\n')