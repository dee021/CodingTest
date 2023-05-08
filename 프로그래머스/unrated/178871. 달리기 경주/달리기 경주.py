def solution(players, callings):
    rank = {players[i]:i for i in range(len(players))}
    for name in callings:
        idx = rank[name]
        n = players[idx-1]
        players[idx], players[idx-1] = players[idx-1], players[idx]
        rank[n], rank[name] = idx, idx-1
    return players