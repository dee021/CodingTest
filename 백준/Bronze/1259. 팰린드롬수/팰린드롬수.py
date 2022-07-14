import sys
n = sys.stdin.readline().strip()

while int(n):
    n = list(n)
    no = 0
    for i in range(len(n)//2):
        if n[i] != n[len(n)-1-i]:
            no = 1
    print('yes') if no == 0 else print('no')
    n = sys.stdin.readline().strip()