import sys

for line in sys.stdin:
    if line.strip() == 'EOI':
        break
    print(line.strip().lower().count('nemo') and 'Found' or 'Missing')