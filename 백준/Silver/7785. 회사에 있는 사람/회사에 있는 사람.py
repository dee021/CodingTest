import sys

worker = set()
for i in range(int(input())):
    name, state = sys.stdin.readline().split()
    if state == 'enter' and name not in worker:
        worker.add(name)
    if state == 'leave' and name in worker:
        worker.discard(name)
    
print('\n'.join(sorted(list(worker), reverse=True)))