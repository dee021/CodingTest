from collections import Counter

def solution(participant, completion):
    participant = Counter(participant)
    completion = Counter(completion)

    for name in participant.keys():
        if participant[name] != completion[name]:
            return name
    