def figure(num):
    arr=[1,2,3,4,5,6,7,8,9]
    index=0
    for i in range((num//2)+1):
        for k in range(num):
            if i+k<(num//2):
                print(" ",end="")
            elif k<=(num//2)+i:
                print(arr[index],end="")
                index+=1
                if index==9:
                    index=0

        print("\t")            
    for i in range((num//2)-1,-1,-1):
        for k in range(num):
            if i+k<(num//2):
                print(" ",end="")
            elif k<=(num//2)+i:
                print(arr[index],end="")
                index+=1
                if index==9:
                    index=0               
        
        print("\t")

num=int(input("enter odd and positive:"))
if num%2==0 or num<1:        
    print("error")
else:
    figure(num)                        