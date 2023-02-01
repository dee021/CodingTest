import sys
input = sys.stdin.readline

def room(no):
    no = str(no)
    for n in set(no):
        if no.count(n) > 1:
            return False
    return True

while True:
    try:
        n, m = map(int, input().split())
        print(len([x for x in range(n, m+1) if room(x)]))
    except:
        break