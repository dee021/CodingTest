for _ in range(int(input())):
    n = int(input())
    a, b = input(), input()
    sr = len([0 for i in range(n) if a[i] != b[i]])
    cnt = abs(a.count('W')-b.count('W'))
    print(sr - ((sr-cnt)//2 if sr > cnt else 0))