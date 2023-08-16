n = int(input())
arr = list(map(int, input().split()))
m = [10**7]; i = 0

while i < n:
    if arr[i] > m[-1]:
        for j in range(len(m)-1):
            if m[j] > arr[i] > m[j+1]:
                m[j+1] = arr[i]
    elif arr[i] < m[-1]:
        m.append(arr[i])
    i += 1
print(n-len(m)+1)