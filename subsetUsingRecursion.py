def subset(idx,arr,temp):
    n = len(arr)
    if(idx==n):
        print(temp[:])
        return 
    # take 
    subset(idx+1,arr,temp+[arr[idx]])
    # not take
    subset(idx+1,arr,temp)





if __name__=="__main__":
    arr=[1,2,3]
    n= len(arr)
    subset(0,arr,[])