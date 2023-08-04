g = list(map(int, input().split())).index(int(input()))
print(['F', 'C0', 'C+', 'B0', 'B+', 'A0', 'A+'][sum([g < 48, g < 45, g < 35, g < 30, g < 15,g < 5])])