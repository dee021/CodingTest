def sol(string, k):
    ans, i = 0, 0
    while i < len(string):
        if string[i] == '(':
            sub, n = sol(string[i+1:], int(string[i-1]))
            ans += sub -1
            i += n +1
        elif string[i] == ')':
            return k*ans, i
        else:
            ans += 1
        i += 1
    return ans

print(sol(input(),1))