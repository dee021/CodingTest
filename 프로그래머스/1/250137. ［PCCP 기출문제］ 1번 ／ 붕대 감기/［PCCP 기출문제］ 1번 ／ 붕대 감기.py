def solution(bandage, health, attacks):
    state = health
    def heal(state, time):
        state += time * bandage[1]
        state += time//bandage[0] * bandage[2]
        if state > health:
            state = health
        return state
    def attack(state, damage):
        state -= damage
        if state <= 0:
            return 0
        return state
    answer = 0
    cur = 0
    
    for i in range(len(attacks)):
        sec = attacks[i][0] - cur - 1
        cur = attacks[i][0]
        state = heal(state, sec)
        state = attack(state, attacks[i][1])
        if not state:
            return -1
    return state