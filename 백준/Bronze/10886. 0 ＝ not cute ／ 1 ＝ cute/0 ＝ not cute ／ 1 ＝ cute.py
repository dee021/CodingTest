import sys
input = sys.stdin.readline

c = 0; nc = 0;

for i in range(int(input())):
    if int(input()): c += 1
    else: nc += 1
print(c>nc and 'Junhee is cute!' or 'Junhee is not cute!')