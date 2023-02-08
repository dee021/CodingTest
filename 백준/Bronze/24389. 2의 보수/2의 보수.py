n = int(input())
print(bin(((1<<32) - n) ^ n).count('1'))