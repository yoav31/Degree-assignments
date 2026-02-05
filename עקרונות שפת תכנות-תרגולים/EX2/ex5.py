from math import sqrt
def fun(arr):
    sum=0  
    count=0  
    for i in arr:
        if i==199 or i==-1:
            continue
        count+=1
        factor=int(i+10*sqrt(i))
        if factor>=100:
            sum+=100
        else:
            sum+=factor
            average=int(sum/count)
    print(f"the average is: {average}")

num=int(input("add grade or -1 to quit or 199 to not do the test: "))
arr=[]
arr.append(num)
while num != -1:
    num=int(input("add grade or -1 to quit or 199 to not do the test: "))
    arr.append(num)
fun(arr)    