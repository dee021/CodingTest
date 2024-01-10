import sys
input = sys.stdin.readline

for _ in range(int(input())):
    animal = {}
    sound = input().strip().split()
    while True:
        s = input().strip()
        if s == 'what does the fox say?':
            break
        a, g, s = s.split()
        if s == 'fox':
            continue
        for i in range(len(sound)-1, -1, -1):
            if s == sound[i]:
                del sound[i]
    print(' '.join(sound))