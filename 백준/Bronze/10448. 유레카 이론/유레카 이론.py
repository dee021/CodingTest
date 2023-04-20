import sys
input = sys.stdin.readline

t = [x*(x+1)//2 for x in range(1,45)]
ans = [0]*1001

def sol():
    for a in t:
        for b in t:
            for c in t:
                if 1 <= a+b+c <= 1000:
                    ans[a+b+c] = 1
sol()
for _ in range(int(input())):
    print(ans[int(input())])