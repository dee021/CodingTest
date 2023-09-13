s = input(); l = len(s)
w = 'z'*51
for i in range(1,l-2):
    for j in range(i+1, l):
        t = s[:i][::-1] + s[i:j][::-1] + s[j:][::-1]
        if w > t:
            w = t
print(w)