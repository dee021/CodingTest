from collections import deque

def sol(st):
    ans = 0
    while st:
        t = st.popleft()
        l = len(t)
        a, b = t[:l//2], t[l//2:]
        ans += sum(a)*sum(b)
        if l > 2:
            st.extend([a, b])
    return ans

n = int(input())
print(sol(deque([sorted(map(int, input().split()))])))