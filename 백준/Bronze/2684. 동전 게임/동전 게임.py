import sys
input = sys.stdin.readline

cnt = ['TTT', 'TTH', 'THT', 'THH', 'HTT', 'HTH', 'HHT', 'HHH']
index = {cnt[x]:x for x in range(8)}

for _ in range(int(input())):
    cnt = [0 for _ in range(8)]
    coins = input().strip()
    for i in range(38):
        cnt[index[coins[i:i+3]]] += 1
    print(*cnt)