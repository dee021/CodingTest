ans = ''
for o in input().strip():
    if o == 'x':
        print(ans if ans and ans[-1].isnumeric() else ans+'1')
        break
    ans += o
else:
    print(0)