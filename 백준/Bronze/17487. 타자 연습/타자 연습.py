s = input().strip()

both, right, left = 0,0,0
l = 'qwertyasdfgzxcvb'.count
for c in s:
    if not c.isalpha():
        both += 1
    elif l(c.lower()):
        left += 1
    else:
        right += 1
    if c.isupper():
        both += 1

while both:
    both -= 1
    if left <= right:
        left += 1
    else:
        right += 1
print(left, right)