import sys
input = sys.stdin.readline
sys.stdout.write('\n'.join(map(str, sorted([int(input()) for _ in range(int(input()))]))))