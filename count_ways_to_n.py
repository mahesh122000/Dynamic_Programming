def get_ans(n, arr, s):
    count = [0 for i in range(s+1)]
    count[0] = 1
    for j in range(1, s+1):
        for e in arr:
            if j >= e:
                count[j] += count[j-e]
    
    return count[s] % (pow(10,9)+7)

if __name__ == '__main__':
    cases = int(input())
    for _ in range(cases):
        n, s = list(map(int, input().split()))
        arr = list(map(int, input().split()))
        print(get_ans(n, arr, s))