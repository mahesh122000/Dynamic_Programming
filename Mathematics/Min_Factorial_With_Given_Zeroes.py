def getdiff(n):
    temp=n
    count=0
    while temp >=5:
        temp=temp//5
        count+=temp
    return count
# Complete the solve function below.
def solve(n):
    if n>5:
        res=n*5-(n-(n%5))
        df=getdiff(res)
        while df < n:
            res+=+5
            df=getdiff(res)
        return res
    else:
       return n*5