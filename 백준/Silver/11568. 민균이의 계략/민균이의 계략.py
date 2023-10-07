n = int(input())
arr = list(map(int, input().split()))
s = [-1]

for i in range(n):
    if arr[i] > s[-1]:
        s.append(arr[i])
    else:
        for j in range(len(s)-1):
            if s[j] < arr[i] <= s[j+1]:
                s[j+1] = arr[i]
                break
print(len(s)-1)