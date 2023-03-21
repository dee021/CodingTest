def solution(n, words):
    b = ''
    word = set()
    
    for i, w in enumerate(words):
        if w in word or (b and b != w[0]):
            return [i%n+1, i//n+1]
        word.add(w)
        b = w[-1]
    return [0,0]