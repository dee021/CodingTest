def solution(cards1, cards2, goal):
    cards1 = [goal.index(s) if s in goal else 11 for s in cards1]
    if cards1 != sorted(cards1):
        return 'No'
    cards2 = [goal.index(s) if s in goal else 11 for s in cards2]
    if cards2 != sorted(cards2):
        return 'No'
    return 'Yes'