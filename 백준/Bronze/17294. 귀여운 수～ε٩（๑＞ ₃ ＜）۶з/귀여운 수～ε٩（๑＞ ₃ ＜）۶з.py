f = 0
n = list(map(int, list(input())))

for i in range(2, len(n)):
    if n[i-2] - n[i-1] != n[i-1] - n[i]:
        f = 1
        break
print(f and '흥칫뿡!! <(￣ ﹌ ￣)>' or '◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!')