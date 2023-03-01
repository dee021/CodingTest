import operator

lst = [list(map(int, input().split()))]
lst.append([*map(int, input().split())])
lst = [operator.isub(*x) for x in zip(*lst)]
print(abs(sum([x for x in lst if x < 0])))