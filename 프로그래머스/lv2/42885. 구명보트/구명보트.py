from collections import deque

def solution(people, limit):
    people = deque(sorted(people))
    answer = 0
    while people:
        k = people.pop()
        if people and k+people[0] <= limit:
            people.popleft()
        answer += 1
    
    return answer