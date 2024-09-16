from collections import deque

def bfs():
    if inputs == '12345678':
        return 0
    q = deque([['12345678', 0]])
    nums = set(['12345678'])
    while q:
        s, cnt = q.popleft()
        for o in range(4):
            post = ''.join([s[i] for i in index[o]])
            if post == inputs:
                return cnt +1
            if post not in nums:
                q.append([post, cnt+1])
                nums.add(post)

inputs = input().strip().replace(' ', '')
index = [[x for x in range(7, -1, -1)], [3,0,1,2,5,6,7,4], [0,2,5,3,4,6,1,7], [4,1,2,3,0,5,6,7]]
print(bfs())