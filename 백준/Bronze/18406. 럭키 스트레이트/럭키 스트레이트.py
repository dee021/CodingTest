s = input(); l = len(s)//2
print(sum(map(int, s[:l])) == sum(map(int, s[l:])) and 'LUCKY' or 'READY')