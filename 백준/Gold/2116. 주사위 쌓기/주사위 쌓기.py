import sys
input = sys.stdin.readline

n = int(input())
nums = set(range(1, 7))
mem = [[x, 0] for x in range(1,7)]
for _ in range(n):
    dice = list(map(int, input().split()))
    for i in range(6):
        idx = dice.index(mem[i][0])
        if idx in [0, 5]:
            idx1, idx2 = 0,5
        elif idx in [1, 3]:
            idx1, idx2 = 1,3
        else:
            idx1, idx2 = 2,4
        mem[i] = [dice[[idx1, idx2][idx != idx2]], mem[i][1] + max(nums - set([dice[idx1], dice[idx2]]))]

print(max([list(x) for x in zip(*mem)][1]))