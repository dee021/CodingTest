inputs = input().strip()
if inputs.count('::'):
    inputs = inputs.replace('::', ':' * (9 - inputs.count(':')))
inputs = [x.zfill(4) for x in inputs.split(':')]
print(':'.join(inputs))