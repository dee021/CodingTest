h, m, s = map(int, input().split())
time = int(input())
h += time//3600
time = time%3600
m += time // 60
s += time%60
if s >= 60:m+=1;s-=60;
if m >= 60:h+=1;m-=60;
if h >= 24:h%=24;
print(h, m, s)