from math import inf
from bisect import bisect_left as bl, bisect_right as br
from collections import defaultdict

def find(seq, first, last, largest):
  h, ls = 0, len(seq)
  for i in range(ls):
    for j in range(1, largest+1):
      if i+j > ls: break
      sub = seq[i:i+j]
      if sub not in subs: break
      if sub not in genesMap: continue
      index, hs = genesMap[sub]
      h += hs[br(index, last)]-hs[bl(index, first)]
  return h

n = int(input())
genes = input().rstrip().split()
healths = list(map(int, input().rstrip().split()))
q = int(input())
genesMap = defaultdict(lambda: [[], [0]])
subs = set()

for id, gene in enumerate(genes):
  genesMap[gene][0].append(id)
  for j in range(1, len(gene)+1): subs.add(gene[:j])


for v in genesMap.values():
    for i, ix in enumerate(v[0]): v[1].append(v[1][i]+healths[ix])

largest = max(list(map(len, genes)))
min_value, max_value = inf, 0

for _ in range(q):
  first, last, string = input().split()
  h = find(string, int(first), int(last), largest)
  min_value, max_value = min(min_value, h), max(max_value, h)
print(min_value, max_value)







