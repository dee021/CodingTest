n = int(input())
arr = list(map(int, input().split()))
m = [0]

for i in range(n):
    if arr[i] > m[-1]:
        m.append(arr[i])
    else:
        for j in range(len(m)-1):
            if m[j] < arr[i] < m[j+1]:
                m[j+1] = arr[i]
                break
print(len(m)-1)