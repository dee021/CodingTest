prime = [x for x in range(1, 52*20+1)]
for i in range(1,len(prime)):
    if i >= len(prime) or i >= (52*20)**0.5: break
    prime = [x for x in prime if x <= prime[i] or x%prime[i]]

def chNum(char):
    char = ord(char)
    if char >= 97:
        return char - 96
    return char - 38
word = list(map(chNum, input()))
print('It is a prime word.' if sum(word) in prime else 'It is not a prime word.')
