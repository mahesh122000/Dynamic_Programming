def countInRangeUtil(pos, cnt, tight, num): 
 
    if pos == len(num): 
        if cnt == K: 
            return 1
        return 0
    if dp[pos][cnt][tight] != -1: 
        return dp[pos][cnt][tight] 
  
    ans = 0 
    limit = 9 if tight else num[pos] 
  
    for dig in range(limit + 1): 
        currCnt = cnt  
        if dig != 0: 
            currCnt += 1
  
        currTight = tight 
        if dig < num[pos]: 
            currTight = 1
        ans += countInRangeUtil(pos + 1, currCnt, currTight, num) 
  
    dp[pos][cnt][tight] = ans 
    return dp[pos][cnt][tight] 

def countInRange(x): 
    global dp, K, M 
  
    num = [] 
    while x: 
        num.append(x % 10) 
        x //= 10
  
    num.reverse()  
    dp = [[[-1, -1] for i in range(M)] for j in range(M)] 
    return countInRangeUtil(0, 0, 0, num) 
  

if __name__ == "__main__": 
    dp = [] 
    M = 100
    K = 0
  
    L = int(input())
    R = int(input())
    K = int(input())
    m=len(str(R))
    if(m<K):
        print('0')
    else:
        print((countInRange(R) - countInRange(L))%1000000007) 