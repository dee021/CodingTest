n = [*range(10)]
c = [chr(x) for x in range(65, 65+12)]
i = int(input())%60 - 4
print(c[i%12]+str(n[i%10]))