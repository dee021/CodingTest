from collections import deque

idx, ans = -1, 0
n, *match = map(int, open(0).read().split())

while idx < n -1:
    idx += 1
    if match[idx]:
        ans += 1
        light = deque([1,1,0])
        while idx < n and light:
            l = light.popleft()
            idx += 1
            if idx >= n:
                break
            if match[idx] != l:
                ans += 1
                for i in range(3):
                    if len(light) > i:
                        light[i] ^= 1
                    elif i == 2:
                        light.append(0)
                    else:
                        light.append(1)
print(ans)