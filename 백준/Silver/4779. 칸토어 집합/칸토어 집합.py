import sys
input = sys.stdin.readline

def sol(length):
    if length == 1:
        return '-'
    
    s = sol(length//3)
    return s + ' '*(length//3) + s

while True:
    try:
        n = int(input())
    except:
        break
    print(sol(3**n))