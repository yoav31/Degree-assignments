def myPrime(num):
    for i in range(2,int(num/2)+1):
      if num%i==0:
          return False 
    return True

def isFib(x):
    num1=1
    num2=1
    while x>=num1+num2:
        if x==num1+num2:
            return True
        temp=num2
        num2+=num1
        num1=temp    
    return False    


def myFilter(lst,func):
    elements=[]
    for i in lst:
        if func(i)==False:
            elements.append(i)
    for i in elements:
        lst.remove(i) 
    return lst       

def myFilterMulti(lst,funcL):
    elements=[]
    for i in lst:
        for func in funcL:
            if func(i)==False:
                elements.append(i)
                break
    for i in elements:
        lst.remove(i) 
    return lst

print(myFilter([2,4,5,6],myPrime) ) 
print(myFilterMulti([2,4,5,6,7,13],[myPrime,isFib] ))
print(myFilterMulti ([2,4,5,13,41,55,89,107,144],[myPrime,isFib]))
