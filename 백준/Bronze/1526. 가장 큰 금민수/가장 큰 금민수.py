n = input()
arr = ['']
for i in range(len(n)):
    for k in arr[int('1'+'0'*i, 2)-1:]:
        arr.extend([k+'4', k+'7'])
print(max([int(x) for x in arr[1:] if int(x) <= int(n)]))