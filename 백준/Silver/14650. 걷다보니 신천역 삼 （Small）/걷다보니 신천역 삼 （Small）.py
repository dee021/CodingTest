from itertools import product

n = int(input())
arr = [int(''.join(x)) for x in list(product(['0','1','2'], repeat=n)) if x[0] != '0']
print(len([x for x in arr if x%3 == 0]))