cnt = lambda x: x.count('9')

n, m = map(int, input().split())
bingo = [list(map(cnt, input().split())) for _ in range(n)]
max_col_nine = max([sum(x) for x in zip(*bingo)])
max_row_nine = [sum(x) for x in bingo]
print(sum(max_row_nine) - max(max(max_row_nine), max_col_nine))