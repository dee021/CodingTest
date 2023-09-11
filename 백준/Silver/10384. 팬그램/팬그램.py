import sys
input = sys.stdin.readline

for i in range(int(input())):
    string = input().upper().count
    cha = [string(chr(c)) for c in range(ord('A'), ord('Z')+1)]
    print('Case %d: ' %(i+1), end='')
    if all(cha):
        m = min(cha)
        if m >= 3:
            print('Triple pangram!!!')
        else:
            print(['Pangram!','Double pangram!!'][m-1])
    else:
        print('Not a pangram')
